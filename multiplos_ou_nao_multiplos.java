package curso_java;

import java.util.Scanner;

public class multiplos_ou_nao_multiplos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Informe o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("informe o segundo número: ");
		num2 = sc.nextInt();
		if (num1 % num2 == 0) {
			System.out.println("São múltiplos !");
		} else {
			System.out.println("Não são múltiplos !");
		}
		sc.close();

	}
}
