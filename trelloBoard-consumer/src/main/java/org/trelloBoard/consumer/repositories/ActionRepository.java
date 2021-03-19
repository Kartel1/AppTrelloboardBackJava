package org.trelloBoard.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trelloBoard.model.entities.ActionEntity;

public interface ActionRepository extends JpaRepository<ActionEntity, Integer> {}
