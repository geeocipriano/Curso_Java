package controle;

import java.util.Scanner;

public class DesafioPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero de 1 a 10: ");
		int numero = entrada.nextInt();
		if(numero > 0 && numero <= 10) {
			if(numero % 2 == 0) {
				System.out.println("Numero Par!");
			}else {
				System.out.println("Numero Impar!");
			}
		}else {
			System.out.println("Informe um numero valido!");
		}
		entrada.close();
	}
}
