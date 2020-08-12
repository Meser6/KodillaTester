package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class WeatherApplication {

    private final Set<Location> locations = new HashSet<>();
    private final Map<User, Set<Location>> userLocationsMap = new HashMap<>();

    public void addUserToLocation(User user, Location location) {
        if (userLocationsMap.containsKey(user)) {
            userLocationsMap.get(user).add(location);
        } else {
            this.locations.add(location);
            userLocationsMap.put(user, locations);
        }
    }

    public void removeUserFromLocation(User user, Location location) {
        for (Map.Entry<User, Set<Location>> usersMap : userLocationsMap.entrySet()) {
            if (usersMap.getKey().equals(user)) {
                usersMap.getValue().remove(location);
                if (usersMap.getValue().isEmpty()) {
                    this.userLocationsMap.remove(user);
                }
            }
        }
    }

    public void removeUsersFromSubscribe(User user) {
        this.userLocationsMap.remove(user);
    }

    public void sendNotificationToEverybody() {
        this.userLocationsMap.forEach((user, locations) -> user.sendGeneralNotification());
    }

    public void sendNotificationToOneLocation(Location location) {
        this.userLocationsMap.entrySet()
                .stream()
                .filter(user -> user.getValue().contains(location))
                .forEach(user -> user.getKey().sendNotification(location));
    }

    public void removeLocation(Location location) {
        location.deleteLocation();
    }
}

