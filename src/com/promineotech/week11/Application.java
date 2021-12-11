package com.promineotech.week11;

import com.promineotech.week11.optionals.optionals;
import com.promineotech.week11.sort.sort;
import com.promineotech.week11.sort.stream;

public class Application {

  public static void main(String[] args) {
    new Application().run();
  } 
  
  private void run() {
    System.out.println("Part 1, Sort Assignment:");
    System.out.println();
    new sort().run();
    System.out.println();
    System.out.println("Part 2, Stream Assignment:");
    System.out.println();
    new stream().run();
    System.out.println();
    System.out.println("Part 3, Optionals Assignment:");
    System.out.println();
    new optionals().run();
  }

}
