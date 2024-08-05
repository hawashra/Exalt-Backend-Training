package com.exalt.training.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "Employee a", 1600));
        employees.add(new Employee(2, "Employee b", 1700));
        employees.add(new Employee(3, "Employee c", 1800));
        employees.add(new Employee(4, "Employee d", 1900));
        employees.add(new Employee(5, "Employee e", 2000));
        employees.add(new Employee(6, "Employee f", 2100));
        employees.add(new Employee(7, "Employee g", 2200));
        employees.add(new Employee(8, "Employee h", 2300));
        employees.add(new Employee(9, "Employee i", 2400));
        employees.add(new Employee(10, "Employee j", 2500));

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
        * in the example below, findFirst() returns the Optional<Employee> of the first employee with
        * salary > 2000.
        *
        *
        * */

        Optional<Employee> exists = employees
                .stream()
                .filter(e -> e.getSalary() > 2000)
                .findFirst();
        System.out.println(exists.get());


        /*
            reduce() method cont. combines elements of a stream until it reduces to a single output value.
        */
        // T reduce(...)
        employees
                .stream()
                .map(e-> e.getSalary())
                .reduce(Integer::sum)
                .ifPresent(System.out::println);

        // another example on reduce() with Optional<T> reduce(...)
        Optional<Integer> opt = employees
                .stream()
                .filter(e -> e.getSalary() > 2500 /*does not exist*/)
                .map(e -> e.getSalary()).
                reduce(Integer::sum);

        // if the filtering operation contained at least one element
        if (opt.isPresent()) {
            System.out.println(opt.get());
        }
        // if the filtering operation did not have any employee matching the condition.
        else {
            System.out.println("no employees found");
        }
    }
}