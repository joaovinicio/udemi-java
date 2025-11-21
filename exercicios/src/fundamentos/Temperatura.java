package fundamentos;

import java.util.Locale;

public class Temperatura {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		System.out.println(Locale.getDefault());

		final double Ajuste = 32;
		final double Formula = 5.0 / 9.0;
		
		double temperaturaFahrenheit = 86; 
		double temperaturaCelsius = (temperaturaFahrenheit - Ajuste) * Formula;
		System.out.println(temperaturaCelsius);	

		temperaturaFahrenheit = 150;
	    temperaturaCelsius = (temperaturaFahrenheit - Ajuste) * Formula;
		
		System.out.println(temperaturaCelsius);	

	}

}
