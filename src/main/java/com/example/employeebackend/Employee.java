package com.example.employeebackend;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEE")
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String qualification;

    private String designation;

    private long phoneNumber;

    private long salary;

    Employee(){ }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getQualification() {
        return qualification;
    }

    public String getDesignation() {
        return designation;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public Long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", qualification='" + qualification + '\'' +
                ", designation='" + designation + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                '}';
    }

}
