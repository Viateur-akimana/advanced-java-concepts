package codewith.viateur;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
   private String lastname;
   private String firstname;
   private String position;
   private int age;
   private int salary;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String lastname, String firstname, String position, int age, int salary) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.position = position;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && salary == employee.salary && Objects.equals(lastname, employee.lastname) && Objects.equals(firstname, employee.firstname) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastname, firstname, position, age, salary);
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        int lastNameComparison = this.lastname.compareTo(otherEmployee.lastname);
        if (lastNameComparison == 0) {
            return this.firstname.compareTo(otherEmployee.firstname);
        }

        return lastNameComparison;
    }
    @Override
    public String toString() {
        return "Employee{" +
                " '" + lastname + '\'' +
                ", '" + firstname + '\'' +
                ", " + position + '\'' +
                ", " + age +
                ", " + salary +
                '}';
    }
}
