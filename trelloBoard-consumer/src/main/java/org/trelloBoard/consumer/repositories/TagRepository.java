package org.trelloBoard.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trelloBoard.model.entities.TagEntity;

public interface TagRepository extends JpaRepository<TagEntity, Integer> {}
