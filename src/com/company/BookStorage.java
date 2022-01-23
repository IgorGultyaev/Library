package com.company;
//книги доставляются на склад
import com.company.Literature.Literature;
import com.company.libraryStaff.Librarian;
import com.company.libraryStaff.Supplier;

public class BookStorage {
    private Librarian librarian;
    private Literature[] literatures;

        public BookStorage(Librarian librarian, Literature...literature) {
            this.literatures = new Literature[literature.length];
            this.librarian = librarian;
    }

    public Literature[] getLiteratures() {
        return literatures;
    }
}
