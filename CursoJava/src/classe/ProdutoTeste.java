package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "tenis";
		p1.desconto = 0.1;
		p1.preco = 500;
		System.out.println("Seu produto é " + p1.nome + " e custa " + p1.preco);
	}
}
