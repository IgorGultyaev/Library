package com.company.libraryStaff;

import com.company.Literature.Literature;

public class Visitor extends User {
    private int serviceNum;
    public Visitor(String name, int serviceNum) {
        super(name);
        this.serviceNum = serviceNum;
    }

    @Override
    public String toString() {
        return "Visitor{} " + super.toString();
    }

    @Override
    public void getBook(Literature literature, User fromUser) {
    }
}

