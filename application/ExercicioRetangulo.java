/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Retangulo;
import java.util.Scanner;

/**
 *
 * @author peixo
 */
public class ExercicioRetangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();
        System.out.println("Informe a altura e a largura do retângulo respectivamente: ");
        retangulo.altura = sc.nextDouble();
        retangulo.largura = sc.nextDouble();

        System.out.println("Área: " + retangulo.area());
        System.out.println("Perímetro: " + retangulo.perimetro());
        System.out.println("Diagonal: " + retangulo.diagonal());

        sc.close();
    }
}
