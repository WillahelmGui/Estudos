package projeto_teste01;

import java.util.Scanner;

import com.sun.java.swing.action.ExitAction;

public class TelaAula {
	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("************************* \n Bem Vindo \n*************************");
		System.out.println(" 1- Chamada \n 2- Cadastro \n 3- Relatório \n 0- Sair \n*************************");
		String kp = sc1.next();

		do {
			switch (kp) {
			case "1":
				System.out.println("Carregando...");
				break;

			case "2":
				System.out.println("Digite o nome do aluno para iniciar o cadastro");
				String nome = sc1.nextLine();
				System.out.println("Digite a data de nascimento para concluir o cadastro");
				String nascimento = sc1.next();
				System.out.println("Dados do aluno cadastrado:" + nome + " " + nascimento);
				break;

			case "3":
				System.out.println("Relatório não disponível.");
				break;

			case "0":
				System.exit(1);
				break;

			default:
				System.out.println("Digite um número válido");
			}
		} while (kp != "0");
		sc1.close();
	}

}
