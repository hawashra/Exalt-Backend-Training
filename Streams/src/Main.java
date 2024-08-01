import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee(1, "Hamza Awashra", 1500));
        employees.add(new Employee(2, "Jehad Hamayel", 1600));

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
         * the effect is similar to a for loop that loops on empIds
         * and calls the getEmployeeById[empIds[i]] for each Id in
         * empIds.
         *
         * but since map() returns a stream, we have to call .toList() on the
         * return value of map() method.
         */
        Integer[] empIds = {1, 2};
        List<Employee> employees1 = Stream.of(empIds)
                .map(employeeRepo::getEmployeeById)
                .toList();


        employees1.forEach(System.out::println);


        /*
        * stream().filter() function returns elements of the stream that
        * meet the condition passed to it.
        * where e -> e.getSalary() is a lambda expression passed as a parameter to filter()
        *
        * */

        employees1 = Stream.of(empIds)
                .map(employeeRepo::getEmployeeById)
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > 1500)
                .collect(Collectors.toList());

        employees1.forEach(System.out::println);

    }

}