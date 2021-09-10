package classe;

public class Data {
	int dia;
	int mes;
	int ano;

	String dataFormatada() {
		String dataF =String.format("%d/%d/%d",dia,mes,ano);
		return dataF;
	}
}
