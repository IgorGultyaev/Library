package com.company.libraryStaff;

import com.company.Files;
import com.company.Literature.Literature;

import java.math.BigDecimal;
import java.util.Date;

public class Manager extends User implements Reader, Administrator {
    private BigDecimal salary;
    private int specialAllowance;
    private Literature literature;
    public Manager(String name,int serviceNum, String post){
        super(name);
    }

    @Override
    public String toString() {
        return  " Manager{" +
                "salary=" + salary +
                ", specialAllowance=" + specialAllowance +
                "} " + super.toString();
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
