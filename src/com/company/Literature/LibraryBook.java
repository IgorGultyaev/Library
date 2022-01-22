package com.company.Literature;

import com.company.library.User;

public class LibraryBook extends Literature{
    private String author;
    private final String name;
    private User place;
    public LibraryBook(String name){
        this.name = name;
    }


}