package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherApplicationTestSuite {

    WeatherApplication app = new WeatherApplication();
    User u1 = Mockito.mock(User.class);
    User u2 = Mockito.mock(User.class);
    Location l1 = Mockito.mock(Location.class);
    Location l2 = Mockito.mock(Location.class);


    @Test
    public void should_user_add_to_subscribe() {
        app.addUserToLocation(u1, l2);
        app.sendNotificationToOneLocation(l2);
        app.sendNotificationToOneLocation(l2);
        app.sendNotificationToOneLocation(l1);
        Mockito.verify(u1, Mockito.times(2)).sendNotification(l2);
    }

    @Test
    public void should_user_dont_get_notification_if_he_remove_location_subscribe() {
        app.addUserToLocation(u1, l2);
        app.addUserToLocation(u2, l2);
        app.removeUserFromLocation(u1, l2);
        app.sendNotificationToOneLocation(l2);
       // app.sendNotificationToOneLocation(l1);
        Mockito.verify(u2, Mockito.times(1)).sendNotification(l2);
       // Mockito.verify(u2, Mockito.never()).sendNotification(l1);
    }

    @Test
    public void should_user_dont_get_notification_if_he_remove_subscribe() {
        app.addUserToLocation(u1, l2);
        app.addUserToLocation(u2, l2);
        app.sendNotificationToOneLocation(l2);
        app.removeUsersFromSubscribe(u1);
        app.removeUsersFromSubscribe(u2);
        app.sendNotificationToEverybody();
        Mockito.verify(u1, Mockito.times(1)).sendNotification(l2);
        Mockito.verify(u1, Mockito.never()).sendGeneralNotification();
    }

    @Test
    public void should_remove_location(){
        app.removeLocation(l1);
        Mockito.verify(l1, Mockito.times(1)).deleteLocation();
    }

}