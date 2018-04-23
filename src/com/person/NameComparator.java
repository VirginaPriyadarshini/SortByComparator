package com.person;

import java.util.Comparator;

/**
 * @author vpriyada
 *
 */
public class NameComparator implements Comparator<Person> {

  @Override
  public int compare(Person o1, Person o2) {

    return o2.getName().compareTo(o1.getName());
  }

}
