package com.company.library;

import com.company.Literature.Literature;

//находит и выдает книги и уведомляет о просрочках времени возврата.
public interface Administrator {
     void overdueNotification(Reader reader);
     User findBook (Literature[] literature);

}
