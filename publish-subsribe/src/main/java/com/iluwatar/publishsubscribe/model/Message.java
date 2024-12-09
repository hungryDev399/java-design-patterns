package com.iluwatar.publishsubscribe.model;

import java.io.Serializable;

/**
 * Represents a message in the publish-subscribe system.
 */
public class Message implements Serializable {
  private String content;
  private String topic;

  public Message(String content, String topic) {
    this.content = content;
    this.topic = topic;
  }

  public String getContent() {
    return content;
  }

  public String getTopic() {
    return topic;
  }

  @Override
  public String toString() {
    return "Message{topic='" + topic + "', content='" + content + "'}";
  }
}