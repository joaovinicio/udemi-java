package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Tipos de Números Primitivos
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id =56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// tipos númericos reais
		
		float salario = 11_445_44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		
		boolean estaDeFerias = true;
		
		// tipo caractere 
		
		char status = 'a';
		
		// Dias de Empresa
		System.out.println("Dias Trabalhados Durante Estes anos: "+anosDeEmpresa * 335+" dias");
		
		// Número de Viajens
		System.out.println(numeroDeVoos / 2);
		
		// Número de Pontos 
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id +" Ganha: R$ "+ salario);
		System.out.println("Esta de Ferias? "+estaDeFerias);
		System.out.println("Status: "+status);
		
		
	}
	
}
