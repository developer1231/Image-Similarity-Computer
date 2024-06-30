/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.zipper.mavenproject1;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths;
import javax.imageio.ImageIO;
/**
 *
 * @author apple
 */
public class Images {
private BufferedImage image;
private String identifier;
private Path imagePath; 	

public Images(String identifier){
     this.identifier = identifier;
     this.imagePath = Paths.get("/Users/apple/NetBeansProjects/mavenproject1/src/main/java/com/zipper/mavenproject1/" + identifier);
      
   try {
          this.image = ImageIO.read(new File(imagePath.toString()));
        } catch (IOException e) {
            System.out.println("Error reading image: " + e.getMessage());
        }
}

public BufferedImage getImage(){
    return image;
}
}
