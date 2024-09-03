package com.exalt.training.student;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @Operation(
            description = "This endpoint is used to save a student",
            summary = "Save a student",
            responses = {
                    @ApiResponse(
                            description = "Student saved successfully",
                            responseCode = "201"
                    ),
                    @ApiResponse(
                            description = "Student not saved",
                            responseCode = "400"
                    )
            }
    )
    @PostMapping
    public ResponseEntity<String> saveStudent(@RequestBody Student student) {
        try {
            studentService.saveStudent(student);
            return new ResponseEntity<>("Student saved successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("There was a problem saving the student", HttpStatus.BAD_REQUEST);
        }
    }

    @Operation(
            description = "This endpoint is used to get all students",
            summary = "Get all students",
            responses = {
                    @ApiResponse(
                            description = "Students retrieved successfully",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Students not retrieved",
                            responseCode = "400"
                    )
            }
    )
    @GetMapping
    public ResponseEntity<List<Student>> findAllStudents() {
        return ResponseEntity.ok(studentService.findAllStudents());
    }

    @Operation(
            description = "This endpoint is used to get a school by id",
            summary = "Get school by id",
            responses = {
                    @ApiResponse(
                            description = "School retrieved successfully",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "School not retrieved",
                            responseCode = "400"
                    )
            }
    )
    @GetMapping("/school/{school-id}")
    public ResponseEntity<List<Student>> findAllStudents(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }
}
