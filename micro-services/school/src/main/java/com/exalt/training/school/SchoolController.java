package com.exalt.training.school;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @Operation(
            description = "This endpoint is used to save a school",
            summary = "Save a school",
            responses = {
                    @ApiResponse(
                            description = "School saved successfully",
                            responseCode = "201"
                    ),
                    @ApiResponse(
                            description = "School not saved",
                            responseCode = "400"
                    )
            }
    )
    @PostMapping
    public ResponseEntity<String> saveSchool(@RequestBody School school) {
        try {
            schoolService.saveSchool(school);
            return new ResponseEntity<>("School saved successfully", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("There was a problem saving the school", HttpStatus.BAD_REQUEST);
        }
    }

    @Operation(
            description = "This endpoint is used to get all schools",
            summary = "Get all schools",
            responses = {
                    @ApiResponse(
                            description = "Schools retrieved successfully",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Schools not retrieved",
                            responseCode = "400"
                    )
            }
    )
    @GetMapping
    public ResponseEntity<List<School>> findAllSchools() {
        return ResponseEntity.ok(schoolService.findAllSchools());
    }

    @Operation(
            description = "This endpoint is used to get students by school ID",
            summary = "Get all students by school ID",
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
    @GetMapping("/with-students/{school-id}")
    public ResponseEntity<FullSchoolResponse> findSchoolsWithStudents(
            @PathVariable("school-id") Integer schoolId
    ) {
        return ResponseEntity.ok(schoolService.findSchoolsWithStudents(schoolId));
    }
}
