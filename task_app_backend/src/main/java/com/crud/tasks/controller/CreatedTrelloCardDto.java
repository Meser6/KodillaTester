package com.crud.tasks.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedTrelloCardDto {

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("shortUrl")
    private String shortUrl;

    public CreatedTrelloCardDto() {
    }

    public CreatedTrelloCardDto(String id, String name, String shortUrl) {
        this.id = id;
        this.name = name;
        this.shortUrl = shortUrl;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortUrl() {
        return shortUrl;
    }
}
