package com.company.Literature;

import java.util.Date;

public class Journal extends Literature{
    public String entity = "Журнал ";
    private int issueNumber;
    private int year;
    private String name;
    public Journal (String name, int issueNumber, int year){
        this.issueNumber = issueNumber;
        this.year = year;
        this.name = name;
    }
    public String nameEntity(){
        return entity + this.name;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "entity='" + entity + '\'' +
                ", issueNumber=" + issueNumber +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
