/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kinectproject;

/**
 *
 * @author artibedded
 */
import javax.swing.JFrame;
import org.kinectProject.setup.MyCanvas;
import org.kinectProject.setup.Setup;
import org.kinectProject.setup.SetupImpl;
import processing.core.PApplet;
import processing.core.PImage;
public class KinectProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Setup setup = new SetupImpl(new PApplet());
        setup.onStetup();
        PImage img = setup.getImage();
        //System.out.println(setup.getImage().pixels.length);
        MyCanvas m = new MyCanvas(img);
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(1027, 720);
        f.setVisible(true);

    }
    
}
