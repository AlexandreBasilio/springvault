package com.javainuse.springvault.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name="employee")
public class Employee {

    @NotNull
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private String empId;

    @NotBlank
    @Column (name="empName")
    private String empName;
}
