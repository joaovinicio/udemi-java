package fundamentos;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Olá Seja Bem Vindo..:");
		
		System.out.println("Trabalhou Terça-Feira? (sim/não)");
		String tv50 = teclado.nextLine().trim();
		
		System.out.println("Trabalhou Quinta0-Feira? (sim/não)");
		String tv32 = teclado.nextLine().trim();
		
		Boolean trabalho1 = tv50.equalsIgnoreCase("sim");
		Boolean trabalho2 = tv32.equalsIgnoreCase("sim");
		
		Boolean sorvete = trabalho1 || trabalho2; 
		String tomouSorvete = sorvete ? "sim" : "não"; 
		
		if(trabalho1 && trabalho2) {
			System.out.println("Você trabalhou 2 dias. Tem dinheiro para Tv 50 é Tomará Sorvete "+tomouSorvete);
		}
		else if(trabalho1 || trabalho2) {
			System.out.println("Você trabalhou 1 dia. Tem dinheiro para Tv 32 é Tomará Sorvete "+tomouSorvete);
		}else {
			System.out.println("Você não trabalhou! não comprará nenhuma tv é nem tomará sorvete");
			System.out.println("Mais ficará mais Saúdavel!!");
		}
		
		teclado.close();
		
	}

}