package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {
        List<LocalDate> list = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                .map(Task::getDeadline)
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
