package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		
		final double formula = 5.0 / 9.0; 
		final double ajuste = 32;
		
		double temperAtual = 86; 
		double resultado = (temperAtual- ajuste) * formula;
		System.out.println(resultado);
		teclado.close();
		
	}

}
