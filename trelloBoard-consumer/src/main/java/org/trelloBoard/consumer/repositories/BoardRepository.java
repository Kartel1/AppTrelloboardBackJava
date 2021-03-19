package org.trelloBoard.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trelloBoard.model.entities.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {}
