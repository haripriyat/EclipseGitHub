package com.haripriya.practice;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToLinkedListExample {

 public static void main(String[] args) {

  String[] countries = { "India", "Switzerland", "Italy", "France" };

  /**
   * List asList(Object[] a) - Returns a fixed-size list backed by the
   * specified array(Changes to the returned list "write through" to the
   * array).Operations such as add,remove which affects the list size
   * can't be performed on the returned list;which throws
   * java.lang.UnsupportedOperationException.
   **/

  List<String> list = Arrays.asList(countries);
  System.out.println("List contains...");

  // display elements of List

  for (int index = 0; index < list.size(); index++)
   System.out.println(list.get(index));

  System.out.println("Replace an element in the returned list.");

  /** Works perfectly.set won't affect the returned list size **/

  list.set(1, "America");
  System.out
    .println("After replacing 'Switzerland' with 'America'.Array contains...");

  /**
   * Notice that changes to the returned list will also be reflected in
   * the array.
   **/

  for (String c : countries) {
   System.out.println(c);
  }

  System.out.println("Add an element in the returned list.");

  /**
   * try to change size of the returned list, throws
   * UnsupportedOperationException
   **/
  list.add("Canada");

 }
}