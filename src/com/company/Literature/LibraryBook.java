package com.company.Literature;

public class LibraryBook extends Literature{
    private final String entity = "Книга ";
    private String author;
    private final String name;

    public LibraryBook(String name, String author){
        this.name = name;
    }

    public String getName() {
        return entity + this.name;
    }

}