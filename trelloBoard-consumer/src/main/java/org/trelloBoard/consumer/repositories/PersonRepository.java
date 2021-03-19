package org.trelloBoard.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trelloBoard.model.entities.PersonEntity;

public interface PersonRepository extends JpaRepository<PersonEntity, Integer> {}
