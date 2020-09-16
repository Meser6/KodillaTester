package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloDto {

    @JsonProperty
    private int board;
    @JsonProperty
    private int card;

    public TrelloDto() {
    }

    public TrelloDto(int board, int card) {
        this.board = board;
        this.card = card;
    }

    public int getBoard() {
        return board;
    }

    public int getCard() {
        return card;
    }
}
