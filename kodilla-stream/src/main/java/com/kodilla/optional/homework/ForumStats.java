package com.kodilla.optional.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double averageMoreOrEqual40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(p -> p.getNumberOfPosts())
                .mapToInt(l -> l)
                .average()
                .getAsDouble();

        double averageBelow40 = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(p -> p.getNumberOfPosts())
                .mapToInt(l -> l)
                .average()
                .getAsDouble();

        System.out.println("More or equal 40: " + averageMoreOrEqual40);
        System.out.println("Below 40: " + averageBelow40);
    }
}
