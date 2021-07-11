package com.mmartynava.epam.exceptions.model;

public class Subject {

    private String name;
    private Integer mark;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        if (mark < 0 || mark > 10)
            throw new IllegalArgumentException("Incorrect mark, must be at least 0 or higher than 10, " + "current mark = " + mark);
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
