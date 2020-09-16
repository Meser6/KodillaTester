package com.crud.tasks.trello.validator;

import com.crud.tasks.domain.TrelloBoard;
import com.crud.tasks.domain.TrelloCard;
import com.crud.tasks.mapper.TrelloMapper;
import com.crud.tasks.service.TrelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TrelloValidator {

    private static final Logger LOGGER = LoggerFactory.getLogger(TrelloValidator.class);

    public void validateCard(final TrelloCard trelloCard) {
            if(trelloCard.getName().contains("test")) {
                LOGGER.info("Someone is testing my application!");
            } else {
                LOGGER.info("Seems that my application is used in proper way");
            }
        }

    public List<TrelloBoard> validateTrelloBoards(final List<TrelloBoard> trelloBoards) {
        LOGGER.info("Strating filtering boards...");
        List<TrelloBoard> filteredBoards = trelloBoards.stream()
                .filter(trelloBoard -> !trelloBoard.getName().equalsIgnoreCase("test"))
                .collect(Collectors.toList());
        LOGGER.info("Boards have been filtered. Current list size: " + filteredBoards.size());
        return filteredBoards;
    }
}
