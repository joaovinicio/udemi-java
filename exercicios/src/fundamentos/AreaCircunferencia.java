package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		double raio = 3.14;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		System.out.println(area);
		
		
		// O valor de Raio muda pois ele é uma variavel 
		// usando o identificador final antes do tipo (double) o mesmo passa a ser uma constante
		
		
	}

}
