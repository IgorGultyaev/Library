package com.company.library;
//берет и возвращает книги

import com.company.Literature.Literature;

public interface Reader {
    void getBook(Literature literature, User fromUser);
}
