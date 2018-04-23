package com.person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vpriyada
 *
 */
public class Sort {

  private void sortUsingComparator(List<Person> personList) {

    personList.add(new Person("Vijay", 53));
    personList.add(new Person("Ajay", 77));
    personList.add(new Person("Jai", 21));
    System.out.println("Sorting by Name...");
    Collections.sort(personList, new NameComparator());
    for (Person person : personList) {
      System.out.println(person.getName() + " " + person.getAge());
    }
    System.out.println("sorting by age...");
    Collections.sort(personList, new AgeComparator());
    for (Person person : personList) {
      System.out.println(person.getName() + " " + person.getAge());
    }

  }

  public static void main(String args[]) {

    List<Person> personList = new ArrayList<Person>();
    Sort s = new Sort();
    s.sortUsingComparator(personList);
  }

}
