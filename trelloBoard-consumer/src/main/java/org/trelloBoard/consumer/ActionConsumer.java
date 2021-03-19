package org.trelloBoard.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.trelloBoard.consumer.repositories.ActionRepository;
import org.trelloBoard.model.Action;

public class ActionConsumer {
	
	private final ActionRepository actionRepository;
	
	@Autowired
	public ActionConsumer(ActionRepository actionRepository) {
		this.actionRepository = actionRepository;
  }
	
	public Action getActionConsumer() {
		return null;
	}
}
