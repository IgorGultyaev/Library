package com.company.Literature;

import java.util.Date;

public class Newspaper extends Literature{
    public String entity = "Газета ";//TODO Разобраться как лучше сделать, тут или перекинуть её в метод??? если делать приватной то просится в метод
    private final Date date;//TODO Разобраться куда и почему он предлагает её переместить???
    private final int num;//TODO Разобраться куда и почему он предлагает её переместить??? но нужно убрать из ту стринг и финал
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
