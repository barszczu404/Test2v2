package zad2.models;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Team {

    private String name;
    private List<Employee> employeesList;

    public Team(String name, Employee ... employees) {
        this.name = name;
        this.employeesList = Arrays.asList(employees);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(employeesList, team.employeesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employeesList);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", employees=" + employeesList +
                '}';
    }
}
