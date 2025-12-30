package fundamentos;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denoA = 3 * 2;
		double superiorA = numA / denoA;
		
		double numB = (1 - 5) * (2 - 7);
		double denoB = 2; 
		double superiorB = Math.pow(numB / denoB,2);
		
		double superior = Math.pow(superiorA - superiorB ,3);
		
		double inferior = Math.pow(10, 3); 
		
		double total = superior / inferior;
		System.out.println(total);
		
	}

}
