package com.company.Literature;

import java.util.Date;

public class Newspaper extends Literature{
    private final String entity = "Газета ";
    private final Date date;
    private final int num;
    private final String name;
    public Newspaper (Date date, Integer num, String name){
        this.date = date;
        this.num = num;
        this.name = name;
    }

    public Newspaper (Integer num, String name){
        this.date = new Date();
        this.num = num;
        this.name = name;
    }

    public String nameEntity(){

        return entity + this.name;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "entity='" + entity + '\'' +
                ", date=" + date +
                ", num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
