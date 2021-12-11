package com.promineotech.week11;

import java.util.ArrayList;
import java.util.List;

public class camera {
  private String make;
  private static List<camera> cameras = new ArrayList<camera>(
      List.of(new camera("Pentex"), 
          new camera("Nikon"), 
          new camera("Sony"),
          new camera ("Kodak"),
          new camera("Canon")));

  public camera(String make) {
    this.make = make;
  }
  
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }
  
  public static List<camera> getCamera() {
    return cameras;
  }

  public void addCamera(camera cam) {
    cameras.add(cam);
  }
  
  public static int compare(camera cam1, camera cam2) {
    return cam1.getMake().compareTo(cam2.getMake());
  }

  public String toString() {
    return(getMake());
  }
  
}