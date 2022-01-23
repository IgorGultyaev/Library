package com.company.libraryStaff;

import com.company.Files;
import com.company.Literature.Literature;

//находит и выдает книги и уведомляет о просрочках времени возврата.
public interface Administrator {
     void overdueNotification(Files[] files); //просроченное уведомление
     Files findBook (Files[] files, Literature desiredLiterature); //поиск книги
     void getBook(Literature literature, Files[] files, Reader reader); //выдача книги
     void backBook(Literature literature, Files[] files, User returned);

}
