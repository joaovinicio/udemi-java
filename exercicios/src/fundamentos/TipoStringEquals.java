package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2"== "s1");
		System.out.println("2".equals(s1)); // o equals ele compara o valor
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();  // next remove espaço em branco nextline não 
		System.out.println(s2);
		System.out.println("2" == s2.trim()); // trim serve para remover espaços em branco
		System.out.println("2".equals(s2.trim()));  // comparar string sempre utiliza Equals é nao == 
		
		entrada.close();
		
	}
}
