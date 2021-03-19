package org.trelloBoard.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.trelloBoard.consumer.repositories.BoardRepository;
import org.trelloBoard.model.Board;

public class BoardConsumer {

  private final BoardRepository boardRepository;

  @Autowired
  public BoardConsumer(BoardRepository boardRepository) {
    this.boardRepository = boardRepository;
  }

  public Board getBoardConsumer() {
    return null;
  }
}
