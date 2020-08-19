package com.kodilla.spring.basic.spring_dependency_injection;

<<<<<<< HEAD
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SkypeMessageService implements MessageService {
=======
import org.springframework.stereotype.Component;

@Component
public class SkypeMessageService {
>>>>>>> 48e7746... bootcamp

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Skype";
    }
}
