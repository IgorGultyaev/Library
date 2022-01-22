package com.company.libraryStaff;

public class Specialist extends Manager implements Reader, {
    private Category cat;
    public Specialist(String name, int seserviceNum, String post, Category cat) {
        super(name, seserviceNum, post);
        this.cat = cat;
    }

    @Override
    public String toString() {
        return " Specialist{" +
                "cat=" + cat +
                "} " + super.toString();
    }
}
