package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main (String[] args) {
        // создаем список студентов со списком оценок по разным предметам
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Светлана", Arrays.asList(4, 5, 5), "информатика"));
        listStudents.add(new Student("Андрей", Arrays.asList(4, 4, 5), "информатика"));
        listStudents.add(new Student("Мария", Arrays.asList(4, 4, 4), "информатика"));
        listStudents.add(new Student("Александра", Arrays.asList(5, 5, 5), "информатика"));
        listStudents.add(new Student("Марина", Arrays.asList(4, 4, 5), "физика"));
        listStudents.add(new Student("Вячеслав", Arrays.asList(5, 5, 5), "физика"));
        listStudents.add(new Student("Иван", Arrays.asList(4, 4, 5), "математика"));
        listStudents.add(new Student("Алексей", Arrays.asList(4, 4, 4), "информатика"));


        listStudents = listStudents.stream()
                // фильтруем список студентов по специальности "информатика"
                .filter(student -> "информатика".equals(student.getSpeciality()))
                // сортируем список студентов по убыванию среднего балла
                .sorted((student1, student2) -> Double.compare(student2.getAverageGrade(),
                        student1.getAverageGrade()))
                // получаем первые 5 студентов по информатике
                .limit(5)
                .collect(Collectors.toList());

        for (Student student : listStudents) {
            System.out.println(student.getName() + ": " + student.getAverageGrade());
        }
    }
}
