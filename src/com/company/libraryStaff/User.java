package com.company.libraryStaff;

import com.company.Literature.Literature;

public abstract class User implements Reader {
    private String name;

    public User(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
}