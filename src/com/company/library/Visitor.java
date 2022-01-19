package com.company.library;

import java.math.BigDecimal;

public class Visitor extends Staff {
    private String company;
    public Visitor(String name, String company) {
        super(name);
        this.company = company;
    }
}

