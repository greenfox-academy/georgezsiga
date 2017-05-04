package com.greenfox.Model;

import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by georgezsiga on 5/4/17.
 */
@RequiredArgsConstructor
@AllArgsConstructor
public class Pikachu {

  @Getter String name;
  @Getter String food;
  @Getter String drink;
  @Getter
  ArrayList<String> listOfTricks;

  public Pikachu(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    this.listOfTricks = new ArrayList<>();
    listOfTricks.add("You know no tricks yet. Go and learn some!");
  }

  @Override
  public String toString() {
    if (listOfTricks.get(0).equals("You know no tricks yet. Go and learn some!")) {
      return "This is " + name +
          ". Currently living on " + food +
          " and " + drink +
          ". He knows 0 tricks.";
    }
    return "This is " + name +
        ". Currently living on " + food +
        " and " + drink +
        ". He knows " + listOfTricks.size() + " tricks.";
  }
}