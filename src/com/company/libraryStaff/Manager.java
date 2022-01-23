package com.company.libraryStaff;

import com.company.Literature.Literature;

import java.math.BigDecimal;

public class Manager extends User implements Reader {
    private BigDecimal salary;
    private String post;
    private int serviceNum;
    private int specialAllowance;
    //private Literature[] literature;
    private Literature literature;
    public Manager(String name,int serviceNum, String post){
        super(name);
        this.post = post;
        this.serviceNum = serviceNum;
    }

    @Override
    public String toString() {
        return  " Manager{" +
                "salary=" + salary +
                ", specialAllowance=" + specialAllowance +
                "} " + super.toString();
    }


    @Override
    public void tekeBook(Literature literature) {//TODO дописать метод
        this.literature = literature;
        System.out.println(literature.getName + " передана в пользование сотруднику библиотеки " +
                this.post + " табельный номер " + this.serviceNum);
    }

    @Override
    public Literature returnBook() {//TODO дописать метод
        Literature transfer = this.literature;
        this.literature = null;
        System.out.println(this.getName() + " " + this.post + " вернул " + transfer.getName + "в библиотеку");
        return transfer;
    }

    public String getName() {
        return super.getName();
    }
}
