package com.example.project.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 40, columnDefinition= "nvarchar(40)")
    private String firstName;

    @Column(nullable = false, length = 40, columnDefinition= "nvarchar(40)")
    private String lastName;

    @Column(nullable = true, length = 40, columnDefinition= "nvarchar(40)")
    private String city;

    @Column(nullable = true, length = 40, columnDefinition= "nvarchar(40)")
    private String country;

    @Column(nullable = true, length = 20, columnDefinition= "nvarchar(20)")
    private String phone;
}