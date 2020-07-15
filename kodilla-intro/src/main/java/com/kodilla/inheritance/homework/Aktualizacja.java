package com.kodilla.inheritance.homework;

public class Aktualizacja extends SystemOne {
    public Aktualizacja(int systemYear, int id) {
        super(systemYear, id);
    }

    public void writeAuthor() {
        System.out.println(author);
    }

    public void aktualizacja() {
        if (compatibile() == true && systemYear > 2018) {
            System.out.println("Your system version is current");
        } else if (compatibile() == true && systemYear <= 2018 && systemYear >= 2015) {
            System.out.println("Your system version isn't current, but it works ");
        } else {
            System.out.println("Your system is too old.");
        }
    }

}
