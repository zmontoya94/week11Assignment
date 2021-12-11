package com.promineotech.week11.sort;

import java.util.Comparator;
import java.util.List;
import com.promineotech.week11.camera;

public class sort {
  
  public void run() {
    
    System.out.println("Method Reference:\n");
    referenceSort().forEach(camera -> System.out.println(camera.toString()));
    System.out.println("\nLambda expression:\n");
    lambdaSort().forEach(camera -> System.out.println(camera.toString()));
    
  }
  
  public List<camera> lambdaSort(){
    
    List<camera> cameras = camera.getCamera();
    Comparator<camera> comp = (cam1, cam2) -> camera.compare(cam1, cam2);
    cameras.sort(comp);
    return cameras;
    
  }
  
  public List<camera> referenceSort(){
    
    List<camera> cameras = camera.getCamera();
    Comparator<camera> comp = camera::compare;
    cameras.sort(comp);
    return cameras;
    
  }
}
