package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * OK Osoba zainteresowana może zostać zapisana do danej lokalizacji, i zacznie otrzymywać powiadomienia.
 * OK Można wycofać subskrypcję z danej lokalizacji.
 * OK Można wycofać subskrypcję ze wszystkich lokalizacji, co równa się kompletnemu wypisaniu klienta z powiadomień.
 * OK Powiadomienie dla osób w danej lokalizacji powinno dotrzeć tylko do określonej grupy osób.
 * OK Możliwość wysyłki powiadomienia do wszystkich.
 * Możliwość skasowania danej lokalizacji.
 */

public class WeatherApplication {


    private Set<Location> locations = new HashSet<>();
    ;
    private Map<User, Set<Location>> app = new HashMap<>();

    public Map<User, Set<Location>> getApp() {
        return this.app;
    }

    public void addUserToLocation(User user, Location location) {
        if (app.containsKey(user)) {
            app.get(user).add(location);
        } else {
            this.locations.add(location);
            app.put(user, locations);
        }
    }

    public void removeUserFromLocation(User user, Location location) {
        for (Map.Entry<User, Set<Location>> usersMap : app.entrySet()) {
            if (usersMap.getKey().equals(user)) {
                usersMap.getValue().remove(location);
                if (usersMap.getValue().isEmpty()) {
                    this.app.remove(user);
                } //TODO
            }
        }
    }

    public void removeUsersFromSubscribe(User user) {
        this.app.remove(user);
    }

    public void sendNotificationToEverybody() {
        this.app.forEach((user, locations) -> user.sendGeneralNotification());
    }

    public void sendNotificationToOneLocation(Location location) {
        this.app.entrySet()
                .stream()
                .filter(user -> user.getValue().contains(location))
                .forEach(user -> user.getKey().sendNotification(location));
    }

    public void removeLocation(Location location) {
        location.deleteLocation();
    }
}

