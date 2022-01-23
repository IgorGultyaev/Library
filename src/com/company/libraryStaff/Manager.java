package com.company.libraryStaff;

import com.company.Files;
import com.company.Literature.Literature;

import java.math.BigDecimal;

public class Manager extends User implements Reader {
    private BigDecimal salary;
    private String post;
    private int serviceNum;
    private Literature literature;
    public Manager(String name,int serviceNum, String post){
        super(name);
        this.post = post;
        this.serviceNum = serviceNum;
    }

    @Override
    public void tekeBook(Literature literature) {
        this.literature = literature;
        System.out.println(" Сотрудник " + this.post + " табельный номер " + this.serviceNum + " " + super.getName() +
                " взял " + literature.getName());
    }

    @Override
    public void returnBook() {
        System.out.println("Посетитель " + this.getName() + " отдал " + this.literature.getName());
        this.literature = null;
    }

    public String getName() {
        return super.getName();
    }

    public void printFiles(Files[] files){
        System.out.println();
        System.out.println("В библиотеке Вы можете взять следующие книги");
        for (int iFile = 0; iFile < files.length; iFile++) {
            System.out.print(iFile+1 +" "+ files[iFile].getLiterature().getName());
            if (files[iFile].getReader() != null) {
                System.out.println(" находится у читателя " + files[iFile].getReader().getName());
            }else {
                System.out.println(" - литература доступна");
            }
        }
    }

    public Literature getLiterature() {
        return literature;
    }
}
