package br.senai.sc.m3s04.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long books_id;
    private String tittle;

    @ManyToOne
    @JoinColumn (name = "person_id")
    private Person person;

    @Column(nullable = false)
    private Integer yrsPublication;

    @OneToMany(mappedBy = "books")
    private List<Assessment>assessments;


}
