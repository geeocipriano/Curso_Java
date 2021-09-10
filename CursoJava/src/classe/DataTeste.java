package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data data = new Data();
		data.dia = 13;
		data.mes = 03;
		data.ano = 1996;
		
		System.out.println(data.dia + "/" + data.mes + "/" + data.ano);
		System.out.println(data.dataFormatada());
	}
}
