package com.company.library;
//берет и возвращает книги
import com.company.Literature.*;

public interface Reader {
    String takeBook(Literature literature);
    String returnBook (Literature literature);
}
