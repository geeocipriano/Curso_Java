package exercicios;

public class Porta {
	boolean aberta;
	String cor;
	double altura;
	double largura;
	
	String abrirPorta() {
		boolean aberta = true;
		String portaAberta = "A porta foi Aberta";
		if(aberta) {
			System.out.println(portaAberta);;
		}
		
		return portaAberta;
	}
	
	String fecharPorta() {
		boolean aberta = false;
		String portaFechada = "A porta foi Fechada";
		if(!aberta) {
			System.out.println(portaFechada);
		}
		return portaFechada;
	}
}
