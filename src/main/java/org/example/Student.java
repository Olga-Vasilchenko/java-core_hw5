package org.example;

import java.util.List;


public class Student extends Main {
    private String name;
    private List grades;
    private double averageGrade;
    private String speciality;

    public Student (String name, List grades, String speciality) {
        this.name = name;
        this.grades = grades;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getGrades() {
        return grades;
    }

    public void setGrades(List grades) {
        this.grades = grades;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public double getAverageGrade () {
        double asDouble = this.grades
                .stream()
                .mapToDouble(grades1 -> averageGrade)
                .average()
                .orElse(0);
        return asDouble;
    }
    public void setAverageGrade(double value) {
        averageGrade = value;
    }

    @Override
    public String toString() {
        return "" +
                "имя: '" + name + '\'' +
                ", список оценок: " + grades +
                " специальность: " + speciality;
    }

}
