package com.javapi.javaapi.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")

public class Student {

    @Id
    @GeneratedValue
    private int id;
    private String username;
    private String fullName;
    private String password;
    private String role;
}
