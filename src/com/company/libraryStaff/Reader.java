package com.company.libraryStaff;

import com.company.Literature.Literature;

public interface Reader {
    void takeBook(Literature literature);
    void returnBook ();
    String getName();
    Literature getLiterature();
}
