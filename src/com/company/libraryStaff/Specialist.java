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
    public void getBook(Literature literature, Files[] files, Reader reader) {
        Files foundBook = findBook(files, literature);

        if (foundBook.getUser() == null){
            foundBook.setUser(newUser);
            System.out.println("Администратор Выдал книгу: " + newUser.getName());
            newUser.
        }else {
            System.out.println("Книга находиться у пользователя" + foundBook.getUser().getName() +
                    " и не может быть выдана");
        }


    }

    @Override
    public void backBook(Literature literature, Files[] files, User returned) {
        Files returnedBook = findBook(files, literature);
        returnedBook.setUser(null);
        returnedBook.setTakeDate(null);
        System.out.println("Пользователь: " + returned.getName() + "вернул книгу" + returned.getName() + "в библиотеку");
    }

    @Override
    public void overdueNotification(Files[] files) {
        long dayOver = 0;
        for (int findOverdueBook=0; findOverdueBook < files.length; findOverdueBook++){
            dayOver = files[findOverdueBook].getTakeDate().getTime() - new Date().getTime();
            if (dayOver > 10 ) {
                System.out.println("Пользователь: " +
                        files[findOverdueBook].getUser().getName() +
                        " просрочил книгу: " +
                        files[findOverdueBook].getLiterature().getName +
                        " на " + dayOver + " дней");
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
                file= files[findOverdueBook];
                System.out.println("Книга: " + files[findOverdueBook].getLiterature().getName +
                        "она находиться у " + files[findOverdueBook].getUser().getName());
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
