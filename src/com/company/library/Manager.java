package com.company.library;

import com.company.Literature.Literature;

import java.math.BigDecimal;

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
    public void getBook(Literature literature, User fromUser) {
        if (fromUser.literature != null) {
            this.literature = literature;
            fromUser.literature = null;
        }else {
            System.out.println("Такой киниги у пользователя нет!");
        }
    }
}
