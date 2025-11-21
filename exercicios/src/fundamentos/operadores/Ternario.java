package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 7.0;
		String resultadoParcial = media >= 5 ? "Em Recuperação" : "Reprovado";
		String resultadoFinal = media >= 7 ? "Aprovado" : resultadoParcial;
		System.out.println("O aluno está? "+resultadoFinal); 
		
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7.0;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim" : "Não";
		System.out.println("Tem Desconto? "+resultado);
		
		
	}
}
