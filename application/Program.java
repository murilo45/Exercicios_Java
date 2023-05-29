/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Triangle;
import java.util.Scanner;

/**
 *
 * @author peixo
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();
        
        System.out.println("Informe os lados do triângulo X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Informe os lados do triângulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
       
        double areaX = x.area();
        double areaY = y.area();
        
        System.out.println("Área do triângulo X: " + areaX);
        System.out.println("Área do triângulo Y: " + areaY);
        
        if(areaX > areaY){
            System.out.println("A maior área é do triângulo X: " + areaX);
        }else
            System.out.println("A maior área é a do triângulo Y: " + areaY);


        sc.close();
    }
}
