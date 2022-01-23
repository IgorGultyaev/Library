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
    public void tekeBook(Literature literature) {//TODO дописать метод
        this.literature = literature;
        System.out.println("Сотрудник" + this.post + " табельный номер " + this.serviceNum + super.getName() +
                "взял" + literature.getName());
    }

    @Override
    public Literature returnBook() {//TODO дописать метод
        Literature transfer = this.literature;
        this.literature = null;
        System.out.println(this.getName() + " " + this.post + " отдает " + transfer.getName() + "в библиотеку");
        return transfer;
    }

    public String getName() {
        return super.getName();
    }

    public void printFiles(Files[] files){
        for (int iFile = 0; iFile < files.length; iFile++) {
            System.out.print(iFile+1 +" "+ files[iFile].getLiterature().getName());
            if (files[iFile].getReader() != null) {
                System.out.print(" находится у читателя" + files[iFile].getReader().getName());
            }else {
                System.out.println(" - литература доступна");
            }
        }
    }
}
