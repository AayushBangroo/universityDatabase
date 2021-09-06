package com.practice.springboot.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course")
public class Course {

    @Id
    @Column(name = "course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;

    @Column(name = "title")
    private String title;

    @Column(name = "credit")
    private Integer credit;

    @OneToOne(mappedBy = "course",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("course")
    private CourseMaterial courseMaterial;
}