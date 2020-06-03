package com.example.ninopotskhishvili.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, unique=true)
    private String title;
    @Column(nullable = false, unique=true)
    private String country;

}
