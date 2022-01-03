package org.kinectProject.setup;
import java.util.List;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import org.openkinect.freenect.*;
import org.openkinect.processing.*;
import processing.core.PApplet;
import processing.core.PImage;
public class SetupImpl implements Setup{
    private List<Kinect> multiKinect = new ArrayList<Kinect>();
    private int numDevices ;
    PApplet pApplet ;
    public SetupImpl(PApplet pApplet){
          this.pApplet = pApplet;
} 
    public void onStetup(){
        this.numDevices = Kinect.countDevices();
        System.out.println("number of Kinect v1 devices  "+numDevices);
        multiKinect = new ArrayList<Kinect>();
        for (int i= 0 ; i< this.numDevices; i++){
         Kinect tmpKinect =  new Kinect(this.pApplet);
         tmpKinect.activateDevice(i);
         tmpKinect.initVideo();
         multiKinect.add(tmpKinect);
    }
    }
    public PImage getImage(){
       PImage img= this.multiKinect.get(0).getVideoImage(); 
       pApplet.image(img, 320, 240);
       this.multiKinect.get(0).stopVideo();
       return img; 

}
     
}
