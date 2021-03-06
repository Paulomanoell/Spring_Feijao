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
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 40, columnDefinition= "nvarchar(40)")
    private String companyName;

    @Column(nullable = false, length = 50, columnDefinition= "nvarchar(50)")
    private String contactName;

    @Column(nullable = false, length = 40, columnDefinition= "nvarchar(40)")
    private String contactTitle;

    @Column(nullable = false, length = 40, columnDefinition= "nvarchar(40)")
    private String city;

    @Column(nullable = false, length = 40, columnDefinition= "nvarchar(40)")
    private String country;

    @Column(nullable = false, length = 30, columnDefinition= "nvarchar(30)")
    private String phone;

    @Column(nullable = false, length = 30, columnDefinition= "nvarchar(30)")
    private String fax;   
}