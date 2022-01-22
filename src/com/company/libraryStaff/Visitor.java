package com.company.libraryStaff;

import com.company.Literature.Literature;
// наследование только от user возможно методы нужно будет продублировать или попытаться вызвать

public class Visitor extends User implements Reader{
    private int serviceNum;

    public Visitor(String name, int serviceNum) {
        super(name);
        this.serviceNum = serviceNum;
    }

    @Override
    public void tekeBook(Literature... literature) {//TODO дописать метод
       Manager.rrrrr();// TODO попробовать реализовать таким образом метод

    }

    @Override
    public void returnBook(Literature... literature) {//TODO дописать метод
    }
}

