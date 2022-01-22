package com.company.libraryStaff;

import com.company.Literature.Literature;

public class Bibliographer extends Manager implements Reader, Librarian{
    String specialization;
    public Bibliographer(String name,
                         int serviceNum,
                         String post,
                         String specialization) {
        super(name,serviceNum, post);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Bibliographer{" +
                "specialization='" + specialization + '\'' +
                "} " + super.toString();
    }
    @Override
       public void OrderBook(Supplier supplier, Librarian librarian,Literature...literatureOrder){ // TODO попробовать вызвать метод с пустым массиво и при ошибке вставить исключение
        int position = 0;
        librarian = this;
        for (Literature order:
                literatureOrder) {
            System.out.println(literatureOrder[position].toString());
            position++;
        }

    }
}
