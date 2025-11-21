package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu Primeiro Salário.: ");
		String valor1 = entrada.next().replace(",", ".");
		
		System.out.println("Digite seu Segundo Salário.: ");
		String valor2 = entrada.next().replace(",", ".");
		
		System.out.println("Digite seu Primeiro Salário.: ");
		String valor3 = entrada.next().replace(",", ".");
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double mediaSalarial = (salario1+salario2+salario3) /3;
		
		double total= mediaSalarial;
		System.out.println("À Média Salarial é: RS "+total);
		
		entrada.close();
		
	}
}
