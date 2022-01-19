package com.company.library;

import java.math.BigDecimal;

public class Bibliographer extends Manager{
    String specialization;
    public Bibliographer(String name,
                         int serviceNum,
                         String post,
                         BigDecimal salary,
                         int specialAllowance,
                         String specialization) {
        super(name,serviceNum, post, salary, Math.min(specialAllowance,3));
        this.specialization = specialization;
    }

}
