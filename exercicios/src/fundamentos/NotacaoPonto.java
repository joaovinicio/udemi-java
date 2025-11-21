package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {

		String s = "Bom dia X";
		s = s.toUpperCase();
		s = s.replace("X", "João");
		System.out.println(s);

		String x = "bom dia leo".replace("leo", "sabrina").toUpperCase();
		System.out.println(x);

		String y = "Bom dia x".replace("x", "gui").toUpperCase().concat("!!!");
		System.out.println(y);
	}

}
