package org.trelloBoard.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trelloBoard.model.entities.CardEntity;

public interface CardRepository extends JpaRepository<CardEntity, Integer> {}
