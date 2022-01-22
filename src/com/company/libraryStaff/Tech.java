package com.company.libraryStaff;

import com.company.Literature.Literature;

public class Tech extends Specialist implements Reader, Supplier{

    public Tech(String name, int seserviceNum, String post, Category cat) {
        super(name,seserviceNum,post, cat);
    }

    @Override
    public String toString() {
        return "Tech{} " + super.toString();
    }


    @Override
    public void BringBook(Librarian librarian, Supplier supplier, Literature... literatureOrder) {//TODO дописать метод

    }
}
