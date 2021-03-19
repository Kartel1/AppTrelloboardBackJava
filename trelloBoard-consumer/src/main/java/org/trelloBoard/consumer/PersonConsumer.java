package org.trelloBoard.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.trelloBoard.consumer.repositories.PersonRepository;
import org.trelloBoard.model.Person;

public class PersonConsumer {

  private final PersonRepository personRepository;

  @Autowired
  public PersonConsumer(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }
  
  public Person getPerson() {
	  return null;
			  
  }
}
