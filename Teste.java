package FuncionarioAposentadoria;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Empresa consulta = new Empresa();
		Scanner leitor = new Scanner (System.in);
		int i=4;
		
		System.out.println("---------------------");
		System.out.println("Digite 1- Para Consulta");
		System.out.println("Digite 0 - Para Sair");
		System.out.println("-----------------------");
		
		i = leitor.nextInt();
		while (i !=0 ) {
			
			System.out.println("---------------------");
			System.out.println("Digite 1- Para Consulta");
			System.out.println("Digite 0 - Para Sair");
			System.out.println("-----------------------");
			int idade = consulta.lerDadosIdade();
			int tempoServico = consulta.lerTempoServico();
			consulta.aposentadoria(idade, tempoServico); 
			
			i = leitor.nextInt();
	}
	}
}
