package com.company.Literature;

import com.company.libraryStaff.Bibliographer;

public class LibraryBook extends Literature{
    private final String entity = "Книга ";
    private String author;
    private final String name;
    private Bibliographer bibliographer;

    public LibraryBook(String name, String author){
        this.name = name;
    }

    public String nameEntity() {
        return entity + this.name;
    }

    @Override
    public String toString() {
        return "LibraryBook{" +
                "entity='" + entity + '\'' +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", bibliographer=" + bibliographer +
                "} " + super.toString();
    }
}