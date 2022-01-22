package com.company.library;

import com.company.Literature.Literature;

public abstract class User implements Reader {
    private String name;
    protected String massage;
    protected Literature literature;

    public User(String name){
        this.name = name;
        this.literature = null;
        this.massage = "";
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
