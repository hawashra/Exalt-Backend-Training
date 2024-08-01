import java.util.List;

public class EmployeeRepo {

    private List<Employee> employees;

    public EmployeeRepo(List<Employee> employees) {
        this.employees = employees;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

}
