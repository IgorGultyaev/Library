package com.company;

import com.company.Literature.Literature;
import com.company.libraryStaff.Librarian;
import com.company.libraryStaff.Supplier;

public class Order {
    private Literature[] list;
    private Librarian customer;
    private Supplier executor;

    public Order(Literature[] list, Supplier executor, Librarian customer) {
        this.list= list;
        this.customer = customer;
        this.executor = executor;
    }

    public Literature[] getList() {
        return list;
    }
}
