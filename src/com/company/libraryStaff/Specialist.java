package com.company.libraryStaff;

import com.company.Files;
import com.company.Literature.Literature;

import java.util.Date;

public class Specialist extends Manager implements Reader, Administrator{
    private Category cat;
    public Specialist(String name, int seserviceNum, String post, Category cat) {
        super(name, seserviceNum, post);
        this.cat = cat;
    }


    @Override
    public void getBook(Literature literature, Files[] files, Reader newReader) {
        Files foundBook = findBook(files, literature);
        if (foundBook.getReader() == null){
            foundBook.setReader(newReader);
            foundBook.setTakeDate(new Date());
            System.out.println("Администратор Выдал книгу: " + foundBook.getLiterature().getName() + " читателю по имни " + newReader.getName());
//            System.out.println(foundBook.getTakeDate());
            }else {
            System.out.println("Книга находиться у пользователя" + foundBook.getReader().getName() +
                    " и не может быть выдана");
        }


    }

    @Override
    public void backBook(Literature literature, Files[] files, Reader returned) {
        Files returnedBook = findBook(files, literature);
        returnedBook.setReader(null);
        returnedBook.setTakeDate(null);
        System.out.println("Администратор " + this.getName() + " отнес " + literature.getName() + " в библиотеку");
    }

    @Override
    public void overdueNotification(Files[] files) {
        long dayOver = 0;
        int useDay = 23;
        for (int findOverdueBook=0; findOverdueBook < files.length; findOverdueBook++){
            if (files[findOverdueBook].getReader() != null) {
                dayOver = new Date().getTime() - files[findOverdueBook].getTakeDate().getTime();
                if (dayOver > useDay ) {
                    System.out.println("Пользователь: " +
                            files[findOverdueBook].getReader().getName() +
                            " просрочил книгу: " +
                            files[findOverdueBook].getLiterature().getName() +
                            " на " + (dayOver - useDay) + " дней");
                    dayOver = 0;
                }
            }

        }
    }

    @Override
    public Files findBook(Files[] files, Literature desiredLiterature) {
        Boolean find = false;
        Files file  = null;
        for (int findOverdueBook=0; findOverdueBook < files.length; findOverdueBook++){
            if (files[findOverdueBook].getLiterature() == desiredLiterature) {
                find = true;
                file = files[findOverdueBook];
            }
        }
        if (find) {
            return file;
        }else{
            System.out.println("Кига не найдена");
            return null;
        }

    }

}
