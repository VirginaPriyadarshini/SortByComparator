package com.person;

import java.util.Comparator;

/**
 * @author vpriyada
 *
 */
public class AgeComparator implements Comparator<Person> {

  @Override
  public int compare(Person o1, Person o2) {

    if (o2.getAge() == o1.getAge())
      return 0;
    else if (o2.getAge() > o1.getAge())
      return 1;
    else
      return -1;
  }
}
