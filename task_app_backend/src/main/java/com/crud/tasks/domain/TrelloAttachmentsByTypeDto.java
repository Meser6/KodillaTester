package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloAttachmentsByTypeDto {
    @JsonProperty("trello")
    private List<TrelloDto> trellos;

    public TrelloAttachmentsByTypeDto() {
    }

    public TrelloAttachmentsByTypeDto(List<TrelloDto> trellos) {
        this.trellos = trellos;
    }

    public List<TrelloDto> getTrellos() {
        return trellos;
    }
}
