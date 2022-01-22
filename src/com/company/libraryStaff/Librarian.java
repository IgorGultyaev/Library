package com.company.libraryStaff;

import com.company.Literature.Literature;

//заказывает книги.
public interface Librarian {
    void OrderBook(Supplier supplier, Librarian librarian, Literature...possBook);

}
