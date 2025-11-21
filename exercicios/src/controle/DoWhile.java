package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você tem que advinhar as palavras Magicas..");
			texto = entrada.nextLine().trim();
			
		} while(!texto.equalsIgnoreCase("Por Favor"));
		
		System.out.println("Obrigado por utilizar nosso Programa!");
		
		entrada.close();
		
		
	}

}
