package zad2.models;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private String surname;
    private Position position;
    private double salary;

    private static int number = 0;

    public Employee() {
    }

    public Employee(String name, String surname, Position position, double salary) {
        setId(++number);
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Position getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname) && position == employee.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, position, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }

    public boolean isJunior() {
        return this.position == Position.JUNIOR_DEVELOPER;
    }

    public boolean isSenior() {
        return this.position == Position.SENIOR_DEVELOPER;
    }
}
