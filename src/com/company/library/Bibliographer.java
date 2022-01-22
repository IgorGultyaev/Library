package com.company.library;

import java.math.BigDecimal;

public class Bibliographer extends Manager{
    String specialization;
    public Bibliographer(String name,
                         int serviceNum,
                         String post,
                         String specialization) {
        super(name,serviceNum, post);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Bibliographer{" +
                "specialization='" + specialization + '\'' +
                "} " + super.toString();
    }
}
