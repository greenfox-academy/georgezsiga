package com.greenfox.Model;

import com.greenfox.Controller.MainController;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Created by georgezsiga on 5/4/17.
 */
@RequiredArgsConstructor
@AllArgsConstructor
public class Pikachu implements Serializable {

  @Getter
  String name;
  @Getter
  String callerId;
  @Getter
  String type;
  @Getter
  String food;
  @Getter
  String drink;
  @Getter
  LocalDate dob;
  @Getter
  LocalTime time;
  @Getter
  int happiness;
  @Getter
  int weight;
  @Getter
  ArrayList<String> listOfTricks;
  @Getter
  ArrayList<String> tricks;
  @Getter
  ArrayList<String> actionHistory;
  @Getter
  ArrayList<String> types;

  public Pikachu(String name, String type, String callerId) {
    this.name = name;
    this.callerId = callerId;
    this.type = type;
    this.food = "nothing";
    this.drink = "nothing";
    this.listOfTricks = new ArrayList<>();
    listOfTricks.add("You doesn`t know any tricks yet. Go and learn some!");
    this.tricks = new ArrayList<>();
    tricks.add("Walk on the moon");
    tricks.add("Sleep");
    tricks.add("Eat");
    this.actionHistory = new ArrayList<>();
    this.dob = LocalDate.now();
    this.time = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute());
    actionHistory.add(name + " was born on " + dob + " at " + time);
    this.happiness = 50;
    this.weight = 50;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void setDob(LocalDate dob) {
    this.dob = dob;
  }

  public void setHappiness(int happiness) {
    this.happiness = happiness;
    if (this.happiness >= 100)
      this.happiness = 100;
  }

  public void setWeight(int weight) {
    this.weight = weight;
    if (this.weight >= 100)
      this.weight = 100;
  }

  public boolean isDead() {
    if (this.weight <= 0)
      return true;
    if (this.happiness <= 0)
      return true;
    return false;
  }

  public void addTrick(String trick) {
    if (listOfTricks.contains(trick)) {

    } else {
      if (listOfTricks.get(0).equals("You doesn`t know any tricks yet. Go and learn some!")) {
        listOfTricks = new ArrayList<>();
        listOfTricks.add(trick + " - learned it on " + LocalDate.now());
        tricks.remove(trick);
      } else {
        listOfTricks.add(trick + " - learned it on " + LocalDate.now());
        tricks.remove(trick);
      }
    }
  }

  public void addAction(String action) {
    actionHistory.add(0, action);
  }

  @Override
  public String toString() {
    if (listOfTricks.get(0).equals("You doesn`t know any tricks yet. Go and learn some!")) {
      return "This is " + name +
          ". Currently eats " + food +
          " and drinks " + drink +
          ". He doesn`t know any tricks.";
    }
    return "This is " + name +
        ". Currently eats " + food +
        " and drinks " + drink +
        ". He knows " + listOfTricks.size() + " tricks.";
  }

}
