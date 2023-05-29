/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author peixo
 */
public class Aluno {
    public String nome;
    public double nota1tri, nota2tri, nota3tri;
    
    public double notaFinal(){
        return nota1tri + nota2tri + nota3tri;
    }
    public double valorParaPassar(){
        return 60 - notaFinal();
    }
}
