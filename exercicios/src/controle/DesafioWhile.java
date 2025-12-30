package controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

		double nota = 0;
		int quantidade = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Digite uma nota Válida ou -1 para Sair");
			nota = teclado.nextDouble();

			if (nota >= 0 && nota <= 10) {
				total += nota;
				quantidade++;
			}

			else if (nota != -1) {
				System.out.println("Nota Inválida");
			}

			else if (quantidade > 0) {
				double media = total / quantidade;
				System.out.println("À Média é " + media);
			}

			else {
				System.out.println("Nenhuma nota válida foi digitado Corretamente");
				System.out.println("Obrigado por utilizar nosso Programa!");
			}

		} 

		teclado.close();
	}

}
