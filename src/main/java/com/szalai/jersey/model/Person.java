package com.szalai.jersey.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Person {

    @Id
    @SequenceGenerator(
            name = "person_seq",
            sequenceName = "person_seq"
    )
    @GeneratedValue(
            generator = "person_seq",
            strategy = GenerationType.SEQUENCE
    )
    private Integer id;
    private String name;
    private Integer age;
    private Boolean gender;

    public Person(String name, Integer age, Boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
