package com.company.libraryStaff;

import com.company.Files;
import com.company.Literature.Literature;

import java.math.BigDecimal;
import java.util.Date;

public class Manager extends User implements Reader {
    private BigDecimal salary;
    private int specialAllowance;
    private Literature literature;
    public Manager(String name,int serviceNum, String post){
        super(name);
    }

    @Override
    public String toString() {
        return  " Manager{" +
                "salary=" + salary +
                ", specialAllowance=" + specialAllowance +
                "} " + super.toString();
    }


    @Override
    public void tekeBook(Literature... literature) {//TODO дописать метод

    }

    @Override
    public void returnBook(Literature... literature) {//TODO дописать метод

    }

    public static void rrrrr(){

    }

}
