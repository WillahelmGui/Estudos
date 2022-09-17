package projeto_teste01;

import java.util.Scanner;
public class Despesas {

	public static void main(String[] args) {
		/*Qual a renda do mes?
		 *Quantas despesas existem?
		 *Qual o valor de cada despesa?
		 *Mostrar total de despesas
		 *Mostrar se está ok o mes */
		
		Scanner sc1 = new  Scanner(System.in);
		 
		System.out.println("Digite o valor da sua renda mensal");
		double rendaMes = sc1.nextDouble() ;
		System.out.println("Digite o valor de suas despesas em casa");
		double valorDespesas = sc1.nextDouble(); 
		System.out.println("Digite o valor de tudo pago em dinheiro");
		double tudoEmDinheiro = sc1.nextDouble();
		System.out.println("Digite o valor de tudo pago em cartão "); 
		double tudoEmCartao = sc1.nextDouble();
		
		double totalDespesas= tudoEmDinheiro + tudoEmCartao + valorDespesas;
		double sobraDoMes = rendaMes - totalDespesas ;
			System.out.println("Sobrou: " + sobraDoMes);
		
		if(totalDespesas > rendaMes) {
			System.out.println("Nome no Serasa");
		}
		else {
			System.out.println("Deu bom");
		}
		
	}

}
