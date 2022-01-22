package com.company.library;

import com.company.Literature.Literature;

public class OutSource extends User{
    private String company;
    private String purpose;
    public OutSource(String name, String company, String purpose) {
        super(name);
        this.company = company;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "company='" + company + '\'' +
                ", purpose='" + purpose + '\'' +
                "} " + super.toString();
    }
    @Override
    public void getBook(Literature literature, User fromUser) {
        System.out.println("\n" +
                "Вы не можете получить книгу, для получения книжки Вам необходимо зарегестрироваться как посетитель и получать табельный номер\n");
    }
}
