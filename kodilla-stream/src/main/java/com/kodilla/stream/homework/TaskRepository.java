package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> taskList = new ArrayList<>();
        taskList.add(new Task("XXX", LocalDate.of(2019, 11, 20), LocalDate.of(2021, 5, 11)));
        taskList.add(new Task("XZX", LocalDate.of(2015, 6, 20), LocalDate.of(2019, 4, 15)));
        taskList.add(new Task("ZXY", LocalDate.of(2014, 4, 13), LocalDate.of(2023, 10, 10)));
        taskList.add(new Task("YZX", LocalDate.of(2009, 7, 4), LocalDate.of(2015, 12, 13)));
        taskList.add(new Task("YXZ", LocalDate.of(2018, 12, 14), LocalDate.of(2029, 7, 26)));
        taskList.add(new Task("ZYX", LocalDate.of(2020, 11, 11), LocalDate.of(2020, 7, 27)));
        return taskList;
    }
}
