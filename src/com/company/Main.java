package com.company;

import com.company.Literature.Journal;
import com.company.Literature.LibraryBook;
import com.company.Literature.Literature;
import com.company.Literature.Newspaper;
import com.company.libraryStaff.*;

import java.util.Date;

public class Main {
    public static void getBook(Literature literature, Files[] files, Reader toReader, Administrator administrator){
            administrator.getBook(literature,files,toReader);
            toReader.tekeBook(literature);
    }
    public static void returnBook(Literature literature, Files[] files, Reader returned,Administrator administrator){
        returned.returnBook();
        administrator.backBook(literature,files,returned);
        }

    public static void main(String[] args) throws InterruptedException {

                Files[] files = new Files[5];
        files[0] = new Files(null,new LibraryBook("История: наука или вымысел?",
               " Глеб Владимирович Носовский , Анатолий Тимофеевич Фоменко "), null);
        files[1] = new Files(null, new LibraryBook("Песнь льда и огня", " Джордж Р. Р. Мартин"),null);
        files[2] = new Files(null, new Journal("Forbes",9,2018),null);
        files[3] = new Files(null, new Newspaper("Правда", 1,1944), null);
        files[4] = new Files(null,new Journal("Юный техник",1,2022), null);

        Manager norsp = new Manager("Люберштэйн Абзитхович", 1234567, "Начальник отдела РСП");
        norsp.printFiles(files);
        Specialist specialist1K = new Specialist("Бит Кодович", 323232, "отдел заказов", Category.I);
        Tech tech = new Tech("Формат Цэ", 456734, "отдел доставки", Category.II);
        Bibliographer bibliographer = new Bibliographer("Добробаба Рума",8787878,"отдел заказов", "Исторя редких грибов");

        Order order = bibliographer.OrderBook(tech,new LibraryBook("Малоизвестные съедобные грибы","Касим Булгаков"),
                new Journal("Фармацевт Практик",3,2017));
        Files[] upFile = order.getExecutor().BringBook(order.getCustomer(),order);

        Files[] newFile = bibliographer.transferFromBStorageToLibrary(upFile,files);
        System.out.println();
        System.out.println("Картотека обновлена");
        files = null;
        upFile = null;
        norsp.printFiles(newFile);

        Reader reader = new Visitor("Иван Ифрактович",32);
        Literature desiredLiterature = newFile[4].getLiterature();

        System.out.println();
        System.out.println("В библиотеку зашел " + reader.getName() + " и обратился с просьбой к дежуному специалисту " + specialist1K.getName());
        System.out.println("Выдайте мне пожалуста " + desiredLiterature.getName());
        getBook(desiredLiterature,newFile,reader,specialist1K);

        desiredLiterature = newFile[6].getLiterature();
        System.out.println();
        System.out.println("В библиотеку зашел " + norsp.getName() + " и обратился с просьбой к дежуному специалисту " + specialist1K.getName());
        System.out.println("Выдайте мне пожалуста " + desiredLiterature.getName());
        getBook(desiredLiterature,newFile,norsp,specialist1K);

        System.out.println();
        norsp.printFiles(newFile);

        System.out.println();
        System.out.println("В конце смены "+ specialist1K.getName() + " проверил нет ли должников");
        specialist1K.overdueNotification(newFile);

        System.out.println();
        System.out.println("Зашел "+ reader.getName() + " и принес " + reader.getLiterature().getName());
        System.out.println();

        returnBook(reader.getLiterature(), newFile, reader,specialist1K);
        System.out.println(specialist1K.getName() + " попросил " + norsp.getName() + " распечатать картотеку");
        norsp.printFiles(newFile);



















    }
}
