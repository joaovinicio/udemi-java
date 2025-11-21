package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;

		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);

		// Operador ! Não condição ele inverte ex for true o resultado é false e vice
		// versa
		// Operador ^ signfica || exclusivo

		// Tabela verdade &&
		
		System.out.println("\nTabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		// Tabela verdade ||
		System.out.println("\nTabela verdade Ou (OR)");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		
		System.out.println("\nTabela verdade Ou Exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		
		System.out.println("\nTabela verdade do (NOT)");
		System.out.println(!true);
		System.out.println(!false);
		
	}

}
