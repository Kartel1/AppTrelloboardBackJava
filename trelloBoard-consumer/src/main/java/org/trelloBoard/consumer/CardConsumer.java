package org.trelloBoard.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.trelloBoard.consumer.repositories.CardRepository;
import org.trelloBoard.model.Card;

public class CardConsumer {

  private final CardRepository cardRepository;

  @Autowired
  public CardConsumer(CardRepository cardRepository) {
    this.cardRepository = cardRepository;
  }

  public Card getCardConsumer() {
    return null;
  }
}
