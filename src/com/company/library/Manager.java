package com.company.library;

import java.math.BigDecimal;

public class Manager extends Staff {
    private BigDecimal salary;
    private int specialAllowance;
    public Manager(String name,int serviceNum, String post, BigDecimal salary, int specialAllowance){
        super(name);
        this.specialAllowance = specialAllowance;

    }

    @Override
    public String toString() {
        return super.toString() +
                " Manager{" +
                "salary=" + salary +
                ", specialAllowance=" + specialAllowance +
                "} " + super.toString();
    }
}
