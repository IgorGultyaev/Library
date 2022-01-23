package com.company.libraryStaff;

import com.company.Literature.Literature;
import com.company.Order;

//заказывает книги.
public interface Librarian {
    Order OrderBook(Supplier supplier, Literature...possBook);
    User getUser();
}
