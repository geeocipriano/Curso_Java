package controle;

import java.util.Scanner;

public class DesafioBissexto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		int bissexto = ano % 4;
		if(bissexto == 0) {
			System.out.println(ano +" Ano Bissexto!");
		}else {
			System.out.println(ano + " Não é Bissexto!");
		}
		entrada.close();
	}
}
