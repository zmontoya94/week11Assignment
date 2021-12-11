package com.promineotech.week11;

import com.promineotech.week11.optionals.optionals;
import com.promineotech.week11.sort.sort;
import com.promineotech.week11.sort.stream;

public class Application {

  public static void main(String[] args) {
    new Application().run();
  } 
  
  private void run() {
    System.out.println("Part 1, Sort Assignment:\n");
    new sort().run();
    System.out.println("\nPart 2, Stream Assignment:\n");
    new stream().run();
    System.out.println("\nPart 3, Optionals Assignment:\n");
    new optionals().run();

  }

}
