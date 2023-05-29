/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author peixo
 */
public class Retangulo {
    public double altura;
    public double largura;
    
    public double area(){
        return altura * largura;
    }
    public double perimetro(){
        return (2 * altura) + (2 * largura);
    }
    public double diagonal(){
        double d;
        return d = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }
}
