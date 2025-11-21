package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("bom");
		System.out.print(" dia\n");
		
		System.out.println("bom");
		System.out.println("dia!");
		
		System.out.printf("Números da MegaSena: %d %d %d %d %d %d", 1,2,3,4,5,6);
		
		System.out.printf("\nSalário: %.2f", 1518.50);
		System.out.println("\nNome: "+ "João");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome");
		String nome = entrada.nextLine();
		System.out.println(nome);
		
		System.out.println("Digite seu sobrenome");
		String sobrenome = entrada.nextLine();
		System.out.println(nome + " "+ sobrenome);
		
		System.out.println("Digite sua idade");
		int idade = entrada.nextInt();
		entrada.hasNextLine();
		System.out.printf("%s %s tem %d anos ",nome +"",sobrenome+"",idade);
	
		entrada.close();
		
		
		
	}

}
