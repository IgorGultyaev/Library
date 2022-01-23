package com.company;

import com.company.Literature.Journal;
import com.company.Literature.LibraryBook;
import com.company.Literature.Literature;
import com.company.Literature.Newspaper;
import com.company.libraryStaff.Manager;


public class Main {
    public static void main(String[] args) {

        Files[] files = new Files[5];
        files[0] = new Files(null,new LibraryBook("История: наука или вымысел?",
               " Глеб Владимирович Носовский , Анатолий Тимофеевич Фоменко "), null);
        files[1] = new Files(null, new LibraryBook("Песнь льда и огня", " Джордж Р. Р. Мартин"),null);
        files[2] = new Files(null, new Journal("Forbes",9,2018),null);
        files[3] = new Files(null, new Newspaper("Правда", 1,1944), null);
        files[4] = new Files(null,new Journal("Юный техник",1,2022), null);

        Manager norsp = new Manager("Люберштэйн Абзитхович", 1234567, "Начальник отдела РСП");
        norsp.printFiles(files);



    }
}
