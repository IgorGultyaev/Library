package com.company.Literature;

import java.util.Date;

public class Newspaper extends Literature{
    public String entity = "Газета ";
    private final Date date;
    private final int num;
    private String name;
    public Newspaper (Date date, Integer num, String name){
        this.date = date;
        this.num = num;
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
