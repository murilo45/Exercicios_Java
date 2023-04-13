package curso_java;

import java.util.Scanner;

public class Soma_de_dois_numeros {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int a,b,res;
    System.out.println("informe o primeiro número:");
    a = sc.nextInt();
    System.out.println("informe o segundo número");
    b =sc.nextInt();
    
    res = a+b;
    
    System.out.println("o resultado da soma dos dois números é: " + res);
    sc.close();
	}

}
