package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    public static List<User> getUsersList() {
        List<User> list = new ArrayList<>();
        list.add(new User("Kuba", 25, 15, "X"));
        list.add(new User("Gosia", 62, 6, "X"));
        list.add(new User("Piotr", 29, 52, "Y"));
        list.add(new User("Damian", 42, 46, "X"));
        list.add(new User("Igor", 48, 99, "Y"));
        list.add(new User("Beata", 16, 7, "Z"));
        list.add(new User("Jola", 53, 63, "Y"));
        return list;
    }
}
