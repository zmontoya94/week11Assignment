package com.promineotech.week11.sort;

import java.util.stream.Collectors;
import com.promineotech.week11.camera;

public class stream {
  public void run() {
    System.out.println(streamToString());
  }

  public String streamToString() {

    return camera.getCamera().stream()
        
        .map(camera::toString)
        .sorted()
        .collect(Collectors.joining("\n"));

  }
}
