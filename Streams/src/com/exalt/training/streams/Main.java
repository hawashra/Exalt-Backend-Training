package com.exalt.training.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "com.exalt.training.streams.Employee a", 1600));
        employees.add(new Employee(2, "com.exalt.training.streams.Employee b", 1700));
        employees.add(new Employee(3, "com.exalt.training.streams.Employee c", 1800));
        employees.add(new Employee(4, "com.exalt.training.streams.Employee d", 1900));
        employees.add(new Employee(5, "com.exalt.training.streams.Employee e", 2000));
        employees.add(new Employee(6, "com.exalt.training.streams.Employee f", 2100));
        employees.add(new Employee(7, "com.exalt.training.streams.Employee g", 2200));
        employees.add(new Employee(8, "com.exalt.training.streams.Employee h", 2300));
        employees.add(new Employee(9, "com.exalt.training.streams.Employee i", 2400));
        employees.add(new Employee(10, "com.exalt.training.streams.Employee j", 2500));

        EmployeeRepo employeeRepo = new EmployeeRepo(employees);


        /*
            forEach performs the action passed to eat for each element in the iterable
            that it's applied on.

            in this example to prints the employees (toString())
         */
        employees.forEach(System.out::println);

        /*
         *
         * stream map() method.
         * returns the result of applying the given function on the elements on the stream.
         *
         * but since map() returns a stream, we have to call .toList() on the
         * return value of map() method.
         */

        Integer[] empIds = {1, 3, 5, 7, 9};
        List<Employee> employees1 = Stream.of(empIds)
                .map(employeeRepo::getEmployeeById)
                .toList();

       // employees1.forEach(System.out::println);

        // TODO: check flatMap() method.


        /*
        * stream().filter() function returns elements of the stream that
        * meet the condition passed to it.
        * where e -> e.getSalary() is a lambda expression passed as a parameter to filter()
        *
        *
        * Gets employees with even Ids from the list employees.
        *
        * peek method is an intermediate operation that returns the stream whereas
        * forEach is a terminal operation that returns void.
        *
        * notice that we can call collect(Collectors.toList())
        *  on the return value of the peek() method.
        *
        * */
        employees1 = employees.stream()
                .filter(e -> e != null)
                .filter(e -> e.getId() % 2 == 0).peek(System.out::println)
                .collect(Collectors.toList());




        /*
        * anyMatch() Returns true if any element found matching with the predicate.
        * Predicate will not be applied to other elements if any matching found.
        *
        * allMatch() Returns true if all elements are matching to the given predicate.
        * noneMatch() Returns true if none of the elements are matching to the predicate.
        * */

        // example using allMatch(), others are similar...
        boolean bool = employees.stream().allMatch(e -> e.getSalary() > 1500);
        System.out.println(bool);


        /*
        * findAny() returns an arbitrary element from the stream
        * findFirst() returns the first element in the stream.
        *
        * in the example below, findFirst() returns the Optional<com.exalt.training.streams.Employee> of the first employee with
        * salary > 2000.
        *
        *
        * */

        Optional<Employee> exists = employees.stream().filter(e -> e.getSalary() > 2000).findFirst();
        System.out.println(exists.get());





    }
}