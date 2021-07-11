package com.mmartynava.epam.exceptions.model;

import com.mmartynava.epam.exceptions.utils.UniversityValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {

    private String name;
    private String address;

    private List<Faculty> faculties = new ArrayList<>();

    public University(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public double getAverageMarkOfSubjectByFacultyNameAndGroupName(String facultyName, String groupName, String subjectName) {
        UniversityValidator.validate(this);
        Faculty currentFaculty = faculties.stream()
                .filter(faculty -> facultyName.equals(faculty.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Can't find faculty with name: %s", facultyName)));

        Group currentGroup = currentFaculty.getGroups().stream()
                .filter(group -> groupName.equals(group.getName()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Can't find group with name: %s", groupName)));

        return currentGroup.getStudents().stream()
                .flatMap(student -> student.getSubjects().stream())
                .filter(subject -> subjectName.equals(subject.getName()))
                .map(Subject::getMark)
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Can't find subject with name: %s", subjectName)));
    }

    public double getAverageMarkOfSubjectsByStudentName(String studentName) {
        UniversityValidator.validate(this);
        return faculties.stream()
                .flatMap(faculty -> faculty.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .filter(student -> studentName.equals(student.getName()))
                .flatMap(student -> student.getSubjects().stream())
                .map(Subject::getMark)
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Can't find student with name: %s", studentName)));
    }

    public double getAverageMarkBySubjectName(String subjectName) {
        UniversityValidator.validate(this);
        return faculties.stream()
                .flatMap(faculty -> faculty.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .flatMap(student -> student.getSubjects().stream())
                .filter(subject -> subjectName.equals(subject.getName()))
                .map(Subject::getMark)
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElseThrow(() -> new IllegalArgumentException(String.format("Can't find subject with name: %s", subjectName)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", \n faculties=" + faculties +
                '}';
    }
}