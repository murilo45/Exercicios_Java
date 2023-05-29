/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author peixo
 */
public class Funcionario {
    public String nome;
    public double salarioBruto;
    public double taxa;
    public double salarioAcres;
    
    public double salarioLiguido(){
        return salarioBruto - taxa;
    }
    
    public void salarioComAcrescimo(double acres){
         salarioAcres = (salarioLiguido() * (acres/100)) + salarioLiguido();
    }
}
