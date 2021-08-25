package Fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		//É possivel indicar uma variavel pelo tipo
		double a = 4.5;
		System.out.println(a);
		
		//Tambem é possivel indicar uma variavel, sem especificar seu tipo
		//O java fara a inferencia, indicando o tipo da variavel de acordo com o
		//valor que foi passado
		 
		var b = 4.5;
		System.out.println(b);
		
		// Neste caso, as duas variaves sao do tipo double, mesmo que nao tenha 
		// Indicado especificamente na segunda variavel, o java ira fazer isso automaticamenteM
	}
}
