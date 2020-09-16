package com.crud.tasks.trello.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TrelloConfig {
    @Value("${trello.api.username}")
    private String trelloApiUsername;

    @Value("${trello.api.endpoint.prod}")
    private String trelloApiEndpoint;

    @Value("${trello.app.key}")
    private String trelloAppKey;

    @Value("${trello.app.token}")
    private String trelloToken;

    public String getTrelloApiUsername() {
        return trelloApiUsername;
    }

    public String getTrelloApiEndpoint() {
        return trelloApiEndpoint;
    }

    public String getTrelloAppKey() {
        return trelloAppKey;
    }

    public String getTrelloToken() {
        return trelloToken;
    }
}
