package projeto_teste01;

import java.util.Scanner;

public class TabelaEmpresa {
public static void main(String[]args) {
	
	Scanner sc1 = new Scanner(System.in);
	
	int totalDespesas = sc1.nextInt();
	int janeiro = sc1.nextInt();
	int fevereiro = sc1.nextInt();
	int marco = sc1.nextInt();
	int despesasTotais = (janeiro + fevereiro + marco);
	int mediaDespesas = (despesasTotais/totalDespesas);
	System.out.println(despesasTotais + " " + mediaDespesas );
	sc1.close();
	}
}