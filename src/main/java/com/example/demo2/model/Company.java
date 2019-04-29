package com.example.demo2.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "company")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    protected String owner;

    public Company(String name, String owner) {
        this.name = name;
        this.owner = owner;
    }
}
