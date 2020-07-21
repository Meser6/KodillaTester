package com.kodilla.collections.adv.immutable.homework;

public class Task {
    final String title;
    final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }
}
