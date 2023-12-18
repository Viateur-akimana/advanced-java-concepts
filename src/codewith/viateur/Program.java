package codewith.viateur;

import java.util.TreeSet;


public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("Mugisha", "Mike", "Software engineer", 20, 3000);
        Employee employee1 = new Employee("Mugisha", "Marc", "Database administrator", 18, 2000);
        Employee employee3 = new Employee("Mugisha", "Mike", "Software Engineer", 20, 3000);
        Employee employee4 = new Employee("Mugisha", "Moses", "Software developer", 20, 3000);
        Employee employee5 = new Employee("Iradukunda", "Sandra", "Database Administrator", 20, 3000);
        Employee employee6 = new Employee("Iradukunda", "Gael", "Software Engineer", 20, 3000);

        TreeSet<Employee> employeeList = new TreeSet<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        for (Employee employeeObj : employeeList) {
            System.out.println(employeeObj);
        }
    }


}
