package com.kodilla.abstracts.homework.Job;

public class Programmer extends Job {
    @Override
    public int salary() {
        return 7000;
    }

    @Override
    public String responsibilities() {
        return "Writing the code";
    }

}
