package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    public static void main(String[] args) {
       List<String> usersnames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("X"))
                .map(UserManager:: getUserName)
                .collect(Collectors.toList());
        System.out.println(usersnames);

    }
    public static String getUserName(User user) {
        return  user.getUsername();
    }
}
