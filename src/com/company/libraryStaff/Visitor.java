package com.company.libraryStaff;

import com.company.Literature.Literature;
// наследование только от user возможно методы нужно будет продублировать или попытаться вызвать

public class Visitor extends User implements Reader{
    private int serviceNum;
    private Literature literature;

    public Visitor(String name, int serviceNum) {
        super(name);

        this.serviceNum = serviceNum;
    }


    @Override
    public void tekeBook(Literature literature) {
        this.literature = literature;
        System.out.println("Посетитель" + super.getName() + " табельный номер " + this.serviceNum +
                " взял " + literature.getName());
    }

    @Override
    public Literature returnBook() {
        Literature transfer = this.literature;
        this.literature = null;
        System.out.println("Посетитель " + this.getName() + "отдал " + this.literature.getName());
        return transfer;
    }
}

