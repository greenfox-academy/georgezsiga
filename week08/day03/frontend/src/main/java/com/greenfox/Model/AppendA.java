package com.greenfox.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by georgezsiga on 5/10/17.
 */
@Getter
@Setter
@NoArgsConstructor
public class AppendA {

  String appended;

  public AppendA(String append) {
    String app = append + "a";
    this.appended = app;
  }
}
