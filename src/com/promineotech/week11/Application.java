package com.promineotech.week11;

import com.promineotech.week11.optionals.optionals;
import com.promineotech.week11.sort.sort;
import com.promineotech.week11.sort.stream;

public class Application {

  public static void main(String[] args) {
    new Application().run();
  }
  
  
  private void run() {
    System.out.println("Sort Assignment:");
    new sort().run();
    System.out.println("Stream Assignment:");
    new stream().run();
    System.out.println("Optionals Assignment:");
    new optionals().run();
  }

}
