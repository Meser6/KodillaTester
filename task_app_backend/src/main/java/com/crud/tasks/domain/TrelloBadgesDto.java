package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TrelloBadgesDto {
    @JsonProperty
    private int votes;

    @JsonProperty("attachmentsByType")
    private List<TrelloAttachmentsByTypeDto> attachmentsByTypeDtos;

    public TrelloBadgesDto() {
    }

    public TrelloBadgesDto(int votes, List<TrelloAttachmentsByTypeDto> attachmentsByTypeDtos) {
        this.votes = votes;
        this.attachmentsByTypeDtos = attachmentsByTypeDtos;
    }

    public int getVotes() {
        return votes;
    }

    public List<TrelloAttachmentsByTypeDto> getAttachmentsByTypeDtos() {
        return attachmentsByTypeDtos;
    }
}
