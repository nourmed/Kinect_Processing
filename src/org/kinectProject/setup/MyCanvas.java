/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kinectProject.setup;

import java.awt.*;  
import javax.swing.JFrame;  
import processing.core.PImage;
  
public class MyCanvas extends Canvas{  
    private Image img;
    public MyCanvas(PImage img){
      this.img = img.getImage();    
}

    /**
     *
     * @param g
     * @throws InterruptedException
     */
    public void paint(Graphics g) {  
        try{
        Thread.sleep(2000);
        Toolkit t=Toolkit.getDefaultToolkit();   
        g.drawImage(img, 120,100,this);  
        }catch(Exception e){
          System.out.println(e.getCause());        
}  
    }  
}