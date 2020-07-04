package com.kodilla.abstracts.homework.Job;

public class Person {
    String firstName;
    int age;
    String job;

    public Person(String firstName, String job, int age) {
        this.firstName = firstName;
        this.job = job.toLowerCase();
        this.age = age;

        //TODO Review kdrzazga - please delete lines below, constructor shoud only create an object
        System.out.println(firstName + " have " + age + " years old, and he is " + job + ".");
        switch (job) {
            case "Tester":
                tester();
                break;
            case "Programmer":
                programmer();
                break;
            case "Scrum Master":
                scrum();
                break;
            case "Charwoman":
                charwoman();
                break;
        }
    }

    public void tester() {
        Tester tester = new Tester();
        System.out.println(" He " + tester.responsibilities() + " and he earn " + tester.salary() + ".");
    }

    public void programmer() {
        Programmer programmer = new Programmer();
        System.out.println(" He " + programmer.responsibilities() + " and he earn " + programmer.salary() + ".");
    }

    public void scrum() {
        ScrumMaster scrum = new ScrumMaster();
        System.out.println(" She " + scrum.responsibilities() + " and she earn " + scrum.salary() + ".");
    }

    public void charwoman() {
        Charwoman charwoman = new Charwoman();
        System.out.println(" She " + charwoman.responsibilities() + " and she earn " + charwoman.salary() + ".");
    }

}
