package com.kodilla.stream;

import java.util.ArrayList;
import java.util.List;

public class UsersRepository {

    public static List<User> getUsersList(){
        List<User> list = new ArrayList<>();
        list.add(new User("Kuba", 25, 5, "X"));
        list.add(new User("Gosia", 22 , 6, "X"));
        list.add(new User("Piotr",29 , 5, "Y"));
        list.add(new User("Damian", 42,4 , "X"));
        list.add(new User("Igor", 18, 9, "Y"));
        list.add(new User("Beata", 16, 7, "Z"));
        list.add(new User("Jola", 23,6 , "Y"));
        return list;
    }
}
