package com.company.Literature;

public class Newspaper extends Literature{
    private final String entity = "Газета ";
    private final int num;
    private final String name;
    private int year;
    public Newspaper (String name, int num, int year){
        this.num = num;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return entity+name;
    }
}
