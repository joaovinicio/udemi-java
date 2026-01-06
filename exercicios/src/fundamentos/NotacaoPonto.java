package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "Lisa");
		System.out.println(s);

		String x = "bom dia leo".replace("leo", "sabrina").toUpperCase();
		System.out.println(x);

		String y = "Bom dia x".replace("x", "Adriana").toUpperCase().concat("!!!");
		System.out.println(y);
		
		String nome = "João Vinicio";
		int quantidade = nome.length();
		
		System.out.println("quantidade é "+quantidade);
		
		// tipos primitivos não tem o operador.
	}

}
