package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class SimpleApplication {

    @Resource(name = "SkypeMessageService")
    private MessageService messageService;

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public String processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            return this.messageService.send(message, receiver);
        }
        return null;
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }

    public void setMessageService(SkypeMessageService messageService) {
        this.messageService = messageService;
    }
}