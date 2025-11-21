package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Olá Pessoal".charAt(2)); // essa função mostra a posição da letra
		
		String s = "Boa tarde".concat("!!"); // faz uma concactenação
		System.out.println(s);
		
		String nova = s.replace("tarde", "Noite"); 
		System.out.println(nova == s);
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("tarde!!"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa tarde!!"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE!!"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 32;
		var salario = 12345.987;
		
		System.out.println("Nome: "+nome +"\nSobrenome: "+
		sobrenome+ "\nidade: "+idade +
				"\nsalario: "+salario);
		
		System.out.printf("Nome: %s \nsobrenome: %s \nidade: %d anos "
				+ "\nSalario: R$ %.2f",nome,sobrenome,idade,salario);
		
		String frase = String.format("\nNome: %s \nsobrenome: %s \nidade: %d anos "+
		"\nSalario: R$ %.2f ",nome,sobrenome,idade,salario);
		
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6 , 10)); 
		
		
	}

}
