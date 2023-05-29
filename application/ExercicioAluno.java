/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import entities.Aluno;
import java.util.Scanner;

/**
 *
 * @author peixo
 */
public class ExercicioAluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.println("");
        System.out.print("Informe a 1º nota: ");
        aluno.nota1tri = sc.nextDouble();
        System.out.print("Informe a 2º nota: ");
        aluno.nota2tri = sc.nextDouble();
        System.out.print("Informe a 3º nota: ");
        aluno.nota3tri = sc.nextDouble();

        System.out.println("Nota final: " + aluno.notaFinal());
        
        if(aluno.notaFinal() >= 60){
            System.out.println("Aprovado");
        }else
            System.out.println("Faltou " + aluno.valorParaPassar() + " pontos.");

        sc.close();
    }
}
