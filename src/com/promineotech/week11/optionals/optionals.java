package com.promineotech.week11.optionals;

import java.util.NoSuchElementException;
import java.util.Optional;
import com.promineotech.week11.camera;


public class optionals {
  public void run() {
    
    System.out.println("Optional with no object:\n");
    Optional<camera> optionCamera = Optional.empty();
    
    try {
      
      System.out.println(optionCams(optionCamera).toString());
      
    }
    catch (NoSuchElementException error) {
      
      System.out.println(error.getMessage());
      
    }
    
    System.out.println("\nOptional with an object:\n");
    optionCamera = Optional.of(new camera("Olympus","OM-D E-M10 Mark III",16));
    System.out.println(optionCams(optionCamera).toString());
  }

  private camera optionCams(Optional<camera> oCamera) {
    return oCamera.orElseThrow(() -> new NoSuchElementException("The cameras you are looking for are in another castle"));
  }
}
