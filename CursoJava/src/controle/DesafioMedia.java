package controle;

import java.util.Scanner;

public class DesafioMedia {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Primeira Nota: ");
		double nota1 = scanner.nextDouble();

		System.out.println("Segunda Nota: ");
		double nota2 = scanner.nextDouble();

		double media = (nota1 + nota2) / 2;


		if (media >= 7) {
			System.out.println("Sua média foi " + media + " e você está Aprovado.");
		} else if (media >= 4) {
			System.out.println("Sua média foi " + media + " e você está de Recuperação.");
		} else {
			System.out.println("Sua média foi " + media + " e você está Reprovado.");
		}

		scanner.close();
	}
}
