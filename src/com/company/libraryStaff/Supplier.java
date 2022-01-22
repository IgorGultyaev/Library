package com.company.libraryStaff;

import com.company.Literature.Literature;
//приносит книги в библиотеку
public interface Supplier {
    void BringBook (Librarian librarian, Supplier supplier, Literature...literatureOrder);
}
