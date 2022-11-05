package desafioFacil;

import java.util.Scanner;


public class distanciaMovimentada {
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[]Args) {
	System.out.println("Informe a quantidade de percursos: ");
		int quantidadePercursos = sc1.nextInt();
		double quantidadeKm = 0;
		double totalKm = 0;
		
		for (int i = 0; i < quantidadePercursos; i++) {
			//Imput de dados do usuario
			quantidadeKm = 1 + (Math.random() * 2);	
			System.out.println("Percurso" + i + ": " + quantidadeKm);
			totalKm += quantidadeKm;
			}
		System.out.println("Total percorrido:" + totalKm);
	}
	
}
//seoarar por métodos para cada funcionalidade.