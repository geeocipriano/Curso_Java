package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe sua nota: ");
		double media = entrada.nextDouble();
		
		if(media >= 7.0) 
			System.out.println("Voce passou de ano!");
		else
			System.out.println("Voce nao passou de ano!");
		
		
		entrada.close();
	}
}
