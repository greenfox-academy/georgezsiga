package Lagopus;

import Lagopus.Mentor;
import Lagopus.Person;
import Lagopus.Sponsor;
import Lagopus.Student;
import java.util.ArrayList;

/**
 * Created by georgezsiga on 4/4/17.
 */
public class TestInput {

  public static void main(String[] args) {
    ArrayList<Person> people = new ArrayList<>();

    Person mark = new Person("Mark", 46, "male");
    people.add(mark);
    Person jane = new Person();
    people.add(jane);
    Student john = new Student("John Doe", 20, "male", "BME");
    people.add(john);
    Student student = new Student();
    people.add(student);
    Mentor gandhi = new Mentor("Gandhi", 148, "male", "senior");
    people.add(gandhi);
    Mentor mentor = new Mentor();
    people.add(mentor);
    Sponsor sponsor = new Sponsor();
    Sponsor elon = new Sponsor("Elon Musk", 46, "male", "SpaceX");

    student.skipDays(3);

    for (int i = 0; i < 5; i++) {
      elon.hire();
    }
    for (int i = 0; i < 3; i++) {
      sponsor.hire();
    }

    for (Person person : people) {
      person.introduce();
      person.getGoal();
    }
  }
}
