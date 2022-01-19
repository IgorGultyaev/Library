package com.company.library;

import java.math.BigDecimal;

public class Specialist extends Manager {
    private Category cat;
    public Specialist(String name, int seserviceNum, String post, BigDecimal salary, int specialAllowance, Category cat) {
        super(name, seserviceNum, post, salary, specialAllowance);
        this.cat = cat;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Specialist{" +
                "cat=" + cat +
                "} " + super.toString();
    }
}
