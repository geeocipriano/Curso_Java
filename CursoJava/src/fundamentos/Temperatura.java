package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double fire = 86;
		final double C1 = 32;
		final double C2 = 5.0 / 9.0;
		double cel = (fire - C1) * C2;
		
		System.out.println(fire + " Fahrenheit = "+ cel + " Celsius");
	}
}
