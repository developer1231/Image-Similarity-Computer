/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.zipper.mavenproject1;

/**
 *
 * @author apple
 */
public class Mavenproject1 {

    public static void main(String[] args) {
       Images x = new Images("image1.jpg");
       Images y = new Images("image2.jpeg");
       ImageHelper computer = new ImageHelper(x, y);
       double similarity = computer.similarity();
       System.out.println(similarity);
    }
}
