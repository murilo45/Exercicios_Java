package curso_java;

import java.util.Scanner;

public class Quantidade_de_itens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prod, quant;
		double total;
		System.out.println("Informe o código do produto adquirido: ");
		prod = sc.nextInt();
		System.out.println("Informe a quantidade adquirida do produto:  ");
		quant = sc.nextInt();
		if (prod == 1) {
			total = 4 * quant;
			System.out.println("Total: R$ " + total);
		} else {
			if (prod == 2) {
				total = 4.50 * quant;
				System.out.println("Total: R$ " + total);
			} else {
				if (prod == 3) {
					total = 5 * quant;
					System.out.println("Total: R$ " + total);
				} else {
					if (prod == 4) {
						total = 2 * quant;
						System.out.println("Total: R$ " + total);
					} else {
						if (prod == 5) {
							total = 1.50 * quant;
							System.out.println("Total: R$ " + total);
						}
					}
				}
			}
		}

		sc.close();
	}
}
