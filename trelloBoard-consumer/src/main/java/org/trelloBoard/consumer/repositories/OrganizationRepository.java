package org.trelloBoard.consumer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.trelloBoard.model.entities.OrganizationEntity;

public interface OrganizationRepository extends JpaRepository<OrganizationEntity, Integer> {}
