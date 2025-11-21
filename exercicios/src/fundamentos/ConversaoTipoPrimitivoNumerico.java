package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a =1;       // conversão implicita
		System.out.println(a);
		
		float b = (float)1.2345; // conversão explicita (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d =(byte) c;
		System.out.println(d);   // O Java não analisa o valor é sim o tipo
	
		
						
		
	}

}
