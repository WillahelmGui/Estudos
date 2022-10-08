package projeto_teste01;

import java.util.Scanner;

/* Funcoes
 * 1 - IMC
 * 2 - TABUADA
 * 3 - DESPESAS
 * 4 - MULTAS
 * 5 - CALCULAR FORMAS
 * 6 - FRETE
 * 7 - PAR OU ÍMPAR
 * 8 -  PEDRA, PAPEL OU TESOURA
 */
public class MenuUtil {
	static Scanner sc1 = new Scanner(System.in);

	public static void mostrarOpcoesMenu() {
		System.out.println("Digite um númnero para escolher a opcao");
		System.out.println("1 - IMC");
		System.out.println("2 - Tabuada");
		System.out.println("3 - Despesas");
		System.out.println("4 - Multas");
		System.out.println("5 - Calcular formas");
		System.out.println("6 - Frete");
		System.out.println("7 - Par ou ímpar");
		System.out.println("8 - Pedra, papel, tesoura");
		System.out.println("0 - Sair");
	}

	public static void fazerImc() {
		System.out.println("Informe sua massa");
		double massa = sc1.nextDouble();
		System.out.println("Informe sua altura");
		double altura = sc1.nextDouble();

		double imc;
		imc = massa / (altura * altura);
		System.out.println("O seu IMC é " + imc + ".");
		if (imc < 18.5) {
			System.out.println("seu índice é: Magreza.");
		} else if (imc >= 18.5 && imc < 24.9) {
			System.out.println("Seu índice é: Normal.");
		} else if (imc >= 24.9 && imc < 30) {
			System.out.println("Seu índice é: Sobrepeso.");
		} else if (imc > 30) {
			System.out.println("Seu índice é: Obesidade");
		}
	}

	public static void fazerTabuada() {
		int i;
		int j = 0;
		int resultado;

		do {
			i = 5;
			resultado = i * j;
			System.out.println(i + "*" + j + "=" + resultado);
			j++;
		} while (j < 11);

		System.out.println();
		j = 0;
	}

	public static void calcularFrete() {
		System.out.println("Digite sua localidade /(AM, SP, RJ, BA OU GO./)");
		String uf = sc1.next();

		switch (uf) {
		case "AM":
			System.out.println("Seu frete é R$35,00");

			break;
		case "SP":
		case "RJ":
			System.out.println("Seu frete é R$10,00");

			break;
		case "BA":
			System.out.println("Seu frete é R$50,00");

			break;
		case "GO":
			System.out.println("Seu frete é R$30,00");

			break;
		default:
			System.out.println("Nào há frete para" + uf);
			break;
		}
	}

	public static void fazerCalculoDespesas() {
		System.out.println("Digite o valor da sua renda mensal");
		double rendaMes = sc1.nextDouble();
		System.out.println("Digite o valor de suas despesas em casa");
		double valorDespesas = sc1.nextDouble();
		System.out.println("Digite o valor de tudo pago em dinheiro");
		double tudoEmDinheiro = sc1.nextDouble();
		System.out.println("Digite o valor de tudo pago em cartão ");
		double tudoEmCartao = sc1.nextDouble();

		double totalDespesas = tudoEmDinheiro + tudoEmCartao + valorDespesas;
		double sobraDoMes = rendaMes - totalDespesas;
		System.out.println("Sobrou: " + sobraDoMes);
		if (totalDespesas > rendaMes) {
			System.out.println("Nome no Serasa");
		} else {
			System.out.println("Deu bom");
		}
	}

	public static void main(String[] args) {

		byte escolha;
		// Loop
		do {
			mostrarOpcoesMenu();
			escolha = sc1.nextByte();

			switch (escolha) {

			case 1:
				System.out.println("IMC");
				fazerImc();
				break;

			case 2:
				System.out.println("Tabuada");
				fazerTabuada();
				break;

			case 3:
				System.out.println("Despesas");
				fazerCalculoDespesas();
				break;

			case 4:
				System.out.println("Multas");
				break;

			case 5:
				System.out.println("Calcular formas");
				break;

			case 6:
				System.out.println("Frete");
				calcularFrete();
				break;

			case 7:
				System.out.println("Par ou ímpar");
				break;

			case 8:
				System.out.println("Pedra, papel e tesoura");
				break;
			}
		} while (escolha != 0);

		sc1.close();
	}

}
