/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Funcionario;
import java.util.Scanner;

/**
 *
 * @author peixo
 */
public class ExercicioSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        
        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();
        
        System.out.print("Salário bruto: ");
        funcionario.salarioBruto = sc.nextDouble();
        
        System.out.print("Taxa: ");
        funcionario.taxa = sc.nextDouble();
        
        System.out.print("Funcionário: " + funcionario.nome + ", $" + funcionario.salarioLiguido());
        
        System.out.println("");
        System.out.print("Qual a porcentagem para adicionar no salário: ");
        double acres = sc.nextDouble();
        funcionario.salarioComAcrescimo(acres);
        
        System.out.print("Funcionário: " + funcionario.nome + ", $" + funcionario.salarioAcres);
        
        sc.close();
    }
}
