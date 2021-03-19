package org.trelloBoard.webapp.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "org.trelloBoard.*")
@EnableJpaRepositories(basePackages = "org.trelloBoard.consumer.repositories")
@EntityScan(basePackages = "org.trelloBoard.model.entities")
public class TrelloBoardWebappConfig {}
