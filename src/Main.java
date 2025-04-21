import examples.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee("jane",5000));
        employeeList.add(new Employee("nathan",6000));
        employeeList.add(new Employee("akshay",9000));
        employeeList.add(new Employee("akshay",4000));
//sort the list in descending order of names followed by increasing salaries
        var employeeComparator=Comparator.comparing((Employee emp)->emp.getName()).reversed()
                        .thenComparing(emp->emp.getSalary());

        employeeList.sort(employeeComparator);
        System.out.println(employeeList);


    }
}