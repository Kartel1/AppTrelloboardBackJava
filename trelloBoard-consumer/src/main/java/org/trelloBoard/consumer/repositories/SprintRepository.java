package org.trelloBoard.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.trelloBoard.model.entities.SprintEntity;

@Repository
public interface SprintRepository extends JpaRepository<SprintEntity, Integer> {}
