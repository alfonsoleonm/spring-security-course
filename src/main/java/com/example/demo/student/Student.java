package com.example.demo.student;

import lombok.Getter;

public class Student {
    @Getter
    private final Integer studentId;
    @Getter
    private final String studentName;

    public Student(Integer studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
