package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		//Abre a caixa de dialogo
		String valor = JOptionPane.showInputDialog("Informe o numero: ");
		
		//Transforma o valor capturado em Inteiro
		int numero = Integer.parseInt(valor);	
		
		//Criando variavel Booleana para ver se o numero é par
		boolean par = numero % 2 == 0;
		
		//Iniciando as condicionais
		if(par) {
			System.out.println("Numero par!");
		}
		else {
			System.out.println("Numero Impar!");
		}
		
	}
}
