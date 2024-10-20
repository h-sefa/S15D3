package org.example.entity;

import java.util.Objects;

public class Employee {
    private int id;
    private String lastname;
    private String firstname;

    public Employee(int id, String firstName , String lastName) {
        this.id = id;
        this.lastname = lastName;
        this.firstname = firstName;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastname + '\'' +
                ", firstName='" + firstname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
