package com.mmartynava.epam.exceptions.utils;

import com.mmartynava.epam.exceptions.model.Faculty;
import com.mmartynava.epam.exceptions.model.University;

import java.util.List;

public class UniversityValidator {
    public static void validate(University university) {
        List<Faculty> faculties = university.getFaculties();
        boolean hasNoGroups = faculties.stream()
                .anyMatch(faculty -> null == faculty.getGroups() || faculty.getGroups().isEmpty());
        if (hasNoGroups) {
            throw new IllegalArgumentException("There are no groups at the faculty");
        }
        boolean hasNoStudents = faculties.stream()
                .flatMap(faculty -> faculty.getGroups().stream())
                .anyMatch(group -> null == group.getStudents() || group.getStudents().isEmpty());
        if (hasNoStudents) {
            throw new IllegalArgumentException("There are no students at the group");
        }
        boolean hasNoSubjects = faculties.stream()
                .flatMap(faculty -> faculty.getGroups().stream())
                .flatMap(group -> group.getStudents().stream())
                .anyMatch(student -> null == student.getSubjects() || student.getSubjects().isEmpty());
        if (hasNoSubjects) {
            throw new IllegalArgumentException("The student has no subjects");
        }
    }
}
