package com.promineotech.week11;

import java.util.ArrayList;
import java.util.List;

public class camera {
  private String make;
  private String model;
  private int megaPixel;
  private static List<camera> cameras = new ArrayList<camera>(
      List.of(new camera("Pentex", "K3",25), 
          new camera("Nikon","D3200",13), 
          new camera("Sony","A6000",24),
          new camera ("Kodak","AZ421",20),
          new camera("Canon","EOS R6",15)));

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
    return(getMake() + " " + getModel() + ", Resolution: " + getMegaPixel() + "MP");
  }


  
}