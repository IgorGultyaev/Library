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
        System.out.println();
        System.out.println("Заказ:");
        for (Literature order:
                literatureOrder) {
            System.out.println(literatureOrder[position].getName());
            position++;
        }
        System.out.println("От " + this.getName());
        System.out.println("Сформирован для исполнителя: "+ supplier.getUser().getName());
        return new Order(literatureOrder,supplier,this);
    }

    @Override
    public Reader getUser() {
        return this;
    }

    public Files[] transferFromBStorageToLibrary(Files[] deliveredBooks, Files[] files){
        Files[] updateFiles = new Files[files.length + deliveredBooks.length];
        int countNewFiles = 0;
        System.out.println();
        System.out.println("Обновление картотеки:");
        for (int count = 0; count < files.length; count++){
            updateFiles[count] = new Files(files[count].getReader(),files[count].getLiterature(),files[count].getTakeDate());
            System.out.println(count+1 + " " + updateFiles[count].getLiterature().getName());
            countNewFiles++;
        }

        files = null;
        for (int count = 0; count < deliveredBooks.length; count++){
            System.out.println("Добавлены со склада:");
            updateFiles[countNewFiles] = new Files(deliveredBooks[count].getReader(),deliveredBooks[count].getLiterature(),deliveredBooks[count].getTakeDate());
            System.out.println(countNewFiles+1 + " " + updateFiles[countNewFiles].getLiterature().getName());
            countNewFiles++;
        }
        return updateFiles;
    }

}
