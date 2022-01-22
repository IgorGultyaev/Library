package com.company.library;

public class Tech extends Specialist{

    public Tech(String name, int seserviceNum, String post, Category cat) {
        super(name,seserviceNum,post, cat);
    }

    @Override
    public String toString() {
        return "Tech{} " + super.toString();
    }
}
