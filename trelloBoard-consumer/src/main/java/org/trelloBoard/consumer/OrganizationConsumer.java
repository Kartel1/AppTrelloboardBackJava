package org.trelloBoard.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.trelloBoard.consumer.repositories.OrganizationRepository;
import org.trelloBoard.model.Organization;

public class OrganizationConsumer {

  private final OrganizationRepository organizationRepository;

  @Autowired
  public OrganizationConsumer(OrganizationRepository organizationRepository) {
    this.organizationRepository = organizationRepository;
  }

  public Organization getOrganization() {
    return null;
  }
}
