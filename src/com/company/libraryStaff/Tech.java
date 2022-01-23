package com.company.libraryStaff;

import com.company.Files;
import com.company.Literature.Literature;
import com.company.Order;

import java.util.Date;

public class Tech extends Manager implements Reader, Supplier{
    private Category category;
    public Tech(String name, int seserviceNum, String post, Category cat) {
        super(name,seserviceNum,post);
        this.category = cat;
    }

    @Override
    public String toString() {
        return "Tech{} " + super.toString();
    }


    @Override
    public Files[] BringBook(Librarian librarian, Order order) {
        Files[] deliveredBooks = new Files[order.getList().length];
        System.out.println("Для библиотекаря: " + librarian.getUser().getName() + "на склад пришла следующая литература:");
        for (int assignment=0; assignment< deliveredBooks.length; assignment++){
            deliveredBooks[assignment].setLiterature(order.getList()[assignment]);
            deliveredBooks[assignment].setReader(librarian.getUser());
            deliveredBooks[assignment].setTakeDate(new Date());
            System.out.println(assignment + " " + deliveredBooks[assignment].getLiterature().getName());
            System.out.println("Заказ от " + this.getName() + " для " + librarian.getUser().getName() + " Выполнен");
            order = null;
        }
        return deliveredBooks;
    }

    @Override
    public User getUser() {
        return this;
    }

}
