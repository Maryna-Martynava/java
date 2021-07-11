package com.mmartynava.epam.exceptions.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    private String name;

    private List<Group> groups = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                ", \n groups=" + groups +
                '}';
    }
}
