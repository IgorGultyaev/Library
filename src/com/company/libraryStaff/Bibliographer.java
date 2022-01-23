package com.company.libraryStaff;

import com.company.Files;
import com.company.Literature.Literature;
import com.company.Order;

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
       public Order OrderBook(Supplier supplier, Literature...literatureOrder){ // TODO попробовать вызвать метод с пустым массиво и при ошибке вставить исключение
        int position = 0;
//        Librarian.NumOrder++;
        System.out.println("Заказ:");
        for (Literature order:
                literatureOrder) {
            System.out.println(literatureOrder[position].toString());
            position++;
        }
        System.out.println("Передан исполнителю: "+ supplier.getUser().getName());
        return new Order(literatureOrder,supplier,this);
    }

    @Override
    public Reader getUser() {
        return this;
    }
    public Files[] transferFromBStorageToLibrary(Files[] deliveredBooks, Files[] files){
        Files[] updateFiles = new Files[files.length + deliveredBooks.length];
        int countNewFiles = 0;
        System.out.println("Обновление картотеки:");
        for (int count = 0; count < files.length; count++){
            updateFiles[count].setTakeDate(files[count].getTakeDate());
            updateFiles[count].setReader(files[count].getReader());
            updateFiles[count].setLiterature(files[count].getLiterature());
            System.out.println(count + "Книга " + updateFiles[count].getLiterature().getName);
            countNewFiles++;

        }
        for (int count = 0; count < deliveredBooks.length; count++){
            System.out.println("Добавлены со склада:");
            updateFiles[countNewFiles++].setTakeDate(deliveredBooks[count].getTakeDate());
            updateFiles[countNewFiles++].setReader(deliveredBooks[count].getReader());
            updateFiles[countNewFiles++].setLiterature(deliveredBooks[count].getLiterature());
            System.out.println(countNewFiles++ + "Книга " + updateFiles[countNewFiles++].getLiterature().getName);
            countNewFiles++;
        }
        return updateFiles;
    }

}
