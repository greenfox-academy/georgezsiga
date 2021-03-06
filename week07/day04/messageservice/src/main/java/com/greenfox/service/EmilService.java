package com.greenfox.service;

import lombok.Getter;

/**
 * Created by georgezsiga on 5/4/17.
 */
public class EmilService implements MessageService {

  @Getter
  String email;
  @Getter
  String message;

  @Override
  public void sendingMessage(String email, String message) {
    this.email = email;
    this.message = message;
    System.out.println(toString());
  }

  @Override
  public String toString() {
    return "EmilService: " +
        "Email sent to: " + email +
        " with messsage: " + message;
  }
}
