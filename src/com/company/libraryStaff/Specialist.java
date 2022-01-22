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
    public void getBook(Literature literature, Files[] files, User newUser) {
        findBook(files, literature).setUser(newUser);

    }


    @Override
    public void overdueNotification(Files[] files) {
        int dayOver = 0;
        for (int findOverdueBook=0; findOverdueBook < files.length; findOverdueBook++){
            dayOver = files[findOverdueBook].getTakeDate().getHours() - new Date().getHours();
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
