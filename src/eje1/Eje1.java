/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1;

import java.util.Scanner;

/**
 *
 * @author ligia
 */
public class Eje1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double lado,area,volumen;
        Scanner lector = new Scanner(System.in);
        System.out.println("digite el lado: ");
        lado=lector.nextDouble();
        area=lado*lado*6;
        volumen=lado*lado*lado;
        System.out.println("el area es: " + area);
        System.out.println("el volumen es : " + volumen);
        // TODO code application logic here
    }
    
}
