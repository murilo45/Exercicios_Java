package curso_java;

import java.util.Scanner;

public class número_negativo_ou_positivo {
    public static void main (String[]args) {
    	Scanner sc = new Scanner (System.in);
    	int num;
    	System.out.println("Informe um número: ");
    	num = sc.nextInt();
    	if(num < 0) {
    		System.out.println("O número é negativo !");
    	}else {
    		if(num > 0) {
    			System.out.println("O número é positivo !"); 
    		}else {
    			System.out.println("O número é 0 !");
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	sc.close();
    }
}
