//Fall 2021
//CS 105
//A21-B

package edu.sbcc.cs105;

import java.util.*;

public class SumFun {
  ArrayList<Integer> numbers = new ArrayList<>();
  
  // TODO add Javadoc comments
  /** add Javadoc comments */
    public void addToList(int i) {
      numbers.add(i);
      
    }
  
  // TODO add Javadoc comments
  /** Javadoc comments */
    public int sumOfAllEvenNumbers() {
      int sum = 0;
      for (Integer i : numbers) {
        if (i % 2 == 0)
          sum += i;
      }
      return sum;
    }
  
  // TODO add Javadoc comments
  /** Javadoc comments */
    public int sumOfEvenNumbers(int start, int end) {
      int sum = 0;
      for (int i = start; i <= end; i++) {
        if (numbers.get(i) % 2 == 0) // TODO test if number at index i of ArrayList numbers is even
        sum += numbers.get(i);
      }
      return sum;
    }
  
  // TODO add Javadoc comments
  /** Javadoc comments */
    public int sumOfAllOddNumbers() {
      int sum = 0;
      for (Integer i : numbers) {
        if (i % 2 == 1)
          sum += i;
      }
      return sum;
    }
  
  //TODO add Javadoc comments
  /** Javadoc comments */
    public int sumOfOddNumbers(int start, int end) {
      int sum = 0;
      for (int i = start; i <= end; i++) {
        if (numbers.get(i) % 2 == 1) // TODO test if number at index i of ArrayList numbers is odd
        sum += numbers.get(i);
      }
      return sum;
    }
  
  // TODO add Javadoc comments
  /** Javadoc comments */
    public int sumOfOddDigitsForItem(int itemIndex) {
      String item = "";
      int sum = 0;
      int digit;
      item = Integer.toString(numbers.get(itemIndex));
      for (int i = 0; i < item.length(); i++) {
        digit = Character.getNumericValue(item.charAt(i));
        if (digit % 2 == 1) // TODO test if digit is odd
        sum += digit;
      }
      return sum;
    }
}

Program.java

package edu.sbcc.cs105;

public class Program {
  
  public static void main(String[] args) {
    SumFun sf = new SumFun();
    for (int i = 0; i <= 39; i++)
      sf.addToList(i);
    
    System.out.println(sf.sumOfAllEvenNumbers());
    System.out.println(sf.sumOfEvenNumbers(3, 31));
  }
  
}