package com.promineotech.week11.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;
import com.promineotech.week11.camera;


public class optionals {
  public void run() {
    
    System.out.println("Optional with no object:");
    Optional<camera> optionCamera = Optional.empty();
    
    try {
      
      System.out.println(optionCams(optionCamera).toString());
      
    }
    catch (NoSuchElementException e) {
      
      System.out.println(e.getMessage());
      
    }
    
    System.out.println("Optional that exists:");
    optionCamera = Optional.of(new camera("Olympus"));
    System.out.println(optionCams(optionCamera).toString());
  }

  private camera optionCams(Optional<camera> oCamera) {
    return oCamera.orElseThrow(() -> new NoSuchElementException("There are no camera(s) here"));
  }
}
