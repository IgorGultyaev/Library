package com.company.library;

import com.company.Literature.Literature;
//приносит книги в библиотеку
public interface Supplier {
    Literature BringBook (Literature literature);
}
