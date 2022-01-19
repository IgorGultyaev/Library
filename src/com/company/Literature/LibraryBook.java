package com.company.Literature;

public class LibraryBook extends Literature{
    public String entity = "Книга "; //сделал публичной специально
    private String author; //TODO Разобраться куда и почему он предлагает её переместить???
    private final String name;
    public LibraryBook(String name, String author){
        this.author= author;
        this.name = name;
    }

    @Override
    public String nameEntity() {
        return entity + this.name;
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "entity='" + entity + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}