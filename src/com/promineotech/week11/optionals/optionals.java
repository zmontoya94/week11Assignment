package com.promineotech.week11.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;
import com.promineotech.week11.camera;


public class optionals {
  public void run() {
    
    System.out.println("Optional with no object:");
    Optional<camera> camOPT = Optional.empty();
    
    try {
      System.out.println(optionCams(camOPT).toString());
    }
    catch (NoSuchElementException e) {
      System.out.println(e.getMessage());
    }
    
    System.out.println("Optional with object:");
    camOPT = Optional.of(new camera("Olympus"));
    System.out.println(optionCams(camOPT).toString());
  }

  private camera optionCams(Optional<camera> ocam) {
    return ocam.orElseThrow(() -> new NoSuchElementException("There are no camera(s) here"));
  }
}
