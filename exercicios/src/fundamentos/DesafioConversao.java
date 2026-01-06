package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Olá, seja bem vindo! ");
		
		System.out.println("Digite o primeiro valor");
		String valor1 = teclado.next().trim().replace(",", ".");
		
		System.out.println("Digite o segundo valor ");
		String valor2 = teclado.next().trim().replace(",", ".");;
		
		System.out.println("Digite o terçeiro valor ");
		String valor3 = teclado.next().trim().replace(",", ".");;
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = (salario1+salario2+salario3);
		System.out.println("Total.: "+soma);
		System.out.println("`Media.: "+soma/3);
		
		
		teclado.close();
	}
}
