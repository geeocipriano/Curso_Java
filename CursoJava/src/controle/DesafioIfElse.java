package controle;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioIfElse {
	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Informe o numero: ");
		String dia = valor.toString();
		Boolean domingo = dia.equals("Domingo");
		Boolean segunda = dia.equals("Segunda");
		Boolean terca = dia.equals("Terca");
		Boolean quarta = dia.equals("Quarta");
		Boolean quinta = dia.equals("Quinta");
		Boolean sexta = dia.equals("Sexta");
		Boolean sabado = dia.equals("Sabado");

		if (domingo) {
			System.out.println("1");
		}
		if (segunda) {
			System.out.println("2");
		}
		if (terca) {
			System.out.println("3");
		}
		if (quarta) {
			System.out.println("4");
		}
		if (quinta) {
			System.out.println("5");
		}
		if (sexta) {
			System.out.println("6");
		}
		if (sabado) {
			System.out.println("7");
		}
	}
}
