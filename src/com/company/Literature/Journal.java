package com.company.Literature;

public class Journal extends Literature{
    private final String entity = "Журнал ";
    private final int issueNumber;
    private final int year;
    private final String name;
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
