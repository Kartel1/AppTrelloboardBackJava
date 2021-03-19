package org.trelloBoard.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.trelloBoard.consumer.repositories.TagRepository;
import org.trelloBoard.model.Tag;

public class TagConsumer {

  private final TagRepository tagRepository;

  @Autowired
  public TagConsumer(TagRepository tagRepository) {
    this.tagRepository = tagRepository;
  }

  public Tag getTag() {
    return null;
  }
}
