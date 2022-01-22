package com.company;

import com.company.Literature.Literature;
import com.company.libraryStaff.User;

import java.util.Date;

public class Files {
    private User user;
    private Literature literature;
    private Date takeDate;

    public Files(User user, Literature literature, Date takeDate) {
        this.user = user;
        this.literature = literature;
        this.takeDate = takeDate;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public User getUser() {
        return user;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
