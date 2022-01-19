package com.company.library;

public abstract class Staff {
    public String name;

    public Staff(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                '}';
    }
}
