package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Byte b = 100; // Autoboxing
		Short s = 1000; // Autoboxing

		System.out.println("Digite o primeiro valor (Inteiro):");
		// next() lê o token e parseInt() converte para int (autoboxing para Integer)
		Integer i = Integer.parseInt(entrada.next());

		// Note que não precisamos de nextLine() aqui

		System.out.println("O segundo valor (Long) é:");
		Long l = Long.parseLong(entrada.next());
		System.out.println("O valor lido para Long é: " + l);

		System.out.println("\n--- Demonstração Wrappers ---");
		// byteValue(): Desempacota o valor primitivo
		System.out.println("Byte b.byteValue(): " + b.byteValue());
		// toString(): Retorna a String do objeto
		System.out.println("Short s.toString(): " + s.toString());
		System.out.println("Integer i lido: " + i);

		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());

		Character c = '#';
		System.out.println(c);
		entrada.close();

		Double d = 34.2345;
		System.out.println(d);

		Float f = 3456.35F;
		System.out.println(f);

	}

}