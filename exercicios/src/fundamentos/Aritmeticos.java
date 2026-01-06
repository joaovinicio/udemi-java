package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println( 2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println("\n");
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); // cast explicito forçei a conversão
		System.out.println(a / (float) b); 
		
		System.out.println(a % b); // Operador Modulo Representado pelo sinal % 
								   // Ele pega o resto da divisão 
		
		System.out.println(x + y - a * b);
		
	}

}
