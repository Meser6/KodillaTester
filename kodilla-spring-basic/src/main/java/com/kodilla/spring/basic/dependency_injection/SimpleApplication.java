package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplication {

    private MessageServicesTwo messageService = new MessageServicesTwo();

    public void processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(message, receiver);
        }
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
