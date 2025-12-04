package com.jspider;

import jakarta.persistence.*;

@Entity
@Table(name = "emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="empno")
    private long empno;

    @Column(name="ename",nullable = false)
    private String ename;

    @Column (name="email",nullable = false,unique = true)
    private String email;




}
