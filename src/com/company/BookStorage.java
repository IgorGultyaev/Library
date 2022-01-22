package com.company;

import com.company.Literature.Literature;
import com.company.libraryStaff.Supplier;

public class BookStorage {
    private Supplier supplier;
    private Literature[] literatures;

        public BookStorage(Supplier supplier, Literature...literature) {
            this.literatures = new Literature[literature.length];
            this.supplier = supplier;
    }

    public Literature[] getLiteratures() {
        return literatures;
    }
}
