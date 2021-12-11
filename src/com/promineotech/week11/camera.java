package com.promineotech.week11;

import java.util.ArrayList;
import java.util.List;

public class camera {
  private String make;
  private String model;
  private int megaPixel;
  private static List<camera> cameras = new ArrayList<camera>(
      List.of(new camera("Pentex", "K70",24), 
          new camera("Nikon","Z5",24), 
          new camera("Sony","A7-IV",33),
          new camera ("Kodak","AZ421",16),
          new camera("Canon","EOS 90D",32)));

  public camera(String make, String model, int megaPixel) {
    this.make = make;
    this.model = model;
    this.megaPixel = megaPixel;
  }
  
  public int getMegaPixel() {
    return megaPixel;
  }

  public void setMegaPixel(int megaPixel) {
    this.megaPixel = megaPixel;
  }
  
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
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
    return(getMake() + " " + getModel() + ", Resolution:" + getMegaPixel() + "MP");
  }


  
}