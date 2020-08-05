package com.kodilla.mockito;

import com.kodilla.notification.Client;
import com.kodilla.notification.Notification;
import com.kodilla.notification.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTestSuite {

    @Test
    public void notSubscribedClientShouldNotReceiveNotification() {
        NotificationService notificationService = new NotificationService();
        Client client = Mockito.mock(Client.class);
        Notification notification = Mockito.mock(Notification.class);

        notificationService.sendNotification(notification);
    }

    @Test
    public void subscribedClientShouldReceiveNotification() {

    }

    @Test
    public void notificationShouldBeSentToAllSubscribedClients() {

    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {

    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {

    }
}
