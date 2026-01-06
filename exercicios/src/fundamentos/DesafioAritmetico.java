package fundamentos;

public class DesafioAritmetico {
	
	public static void main(String[] args) {
		
		System.out.println("Olá, seja bem vindo! à mais um desafio.: ");
		
		double colunaA = Math.pow(6 * (3 + 2), 2); 
		double denoA = 3 * 2;
		
		double resultadoA = colunaA / denoA;
		
		double colunaB = (1 - 5) * (2 - 7); 
		double denoB = 2;
		
		double resultadoB = Math.pow(colunaB / denoB,2);
		
		double solucao = Math.pow(resultadoA - resultadoB, 3); 
		
		double expoente = Math.pow(10, 3); 
		
		double fim = solucao / expoente;
		
		System.out.println(fim);
		
		System.out.println();
		
		
	}

}
