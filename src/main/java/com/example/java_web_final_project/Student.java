package com.example.java_web_final_project;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String favColor;

    public Student() {
    }

    public Student(Integer id, String name, String favColor) {
        this.id = id;
        this.name = name;
        this.favColor = favColor;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFavColor() {
        return favColor;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }
}
