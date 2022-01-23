package com.company;

import com.company.Literature.Literature;
import com.company.libraryStaff.Reader;
import java.util.Date;

public class Files {
    private Reader reader;
    private Literature literature;
    private Date takeDate;

    public Files(Reader reader, Literature literature, Date takeDate) {
        this.reader = reader;
        this.literature = literature;
        this.takeDate = takeDate;
    }

    public Date getTakeDate() {
        return takeDate;
    }

    public Reader getReader(){
        return reader;
    }

    public Literature getLiterature() {
        return literature;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public void setLiterature(Literature literature) {
        this.literature = literature;
    }

    public void setTakeDate(Date takeDate) {
        this.takeDate = takeDate;
    }

}
