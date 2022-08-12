package FuncionarioAposentadoria;

import java.util.Scanner;

public class Empresa {
	Scanner leitor = new Scanner (System.in);
	
	public int lerDadosIdade() { // vai receber e ler a idade do funcionario
		Funcionario1 funcionario = new Funcionario1();
		System.out.println("Digite sua idade ");
		int idade = funcionario.idade;
		return idade;
	}
	public int lerTempoServico() {
		Funcionario1 funcionario = new Funcionario1();
		System.out.println("Digite anos trabalhado");
		int tempoServico = funcionario.tempoServico;
		return tempoServico;
	}
	public boolean aposentadoria (int idade, int tempoServico) {
		if (idade>=65 || tempoServico>=30) {
			System.out.println("Requer Aposentadoria");
			return true;
		} else if (idade>=65 && tempoServico>=25) {
			System.out.println("Requer Aposentadoria");
			return true;
		} else {
			System.out.println("Nao Requer Aposentadoria");
			return false;
		}
	}
}
	
