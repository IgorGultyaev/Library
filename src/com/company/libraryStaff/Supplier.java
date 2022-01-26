package com.company.libraryStaff;

import com.company.Files;
import com.company.Order;

//приносит книги в библиотеку
public interface Supplier {
    Files[] BringBook (Librarian librarian, Order order);
    //String getName();
    User getUser();
}
