package desafioFacil;

import java.util.Scanner;
public class Carro {
	// Sempre inicializar as variaveis com valores atribuidos
	double totalKm = 0;
	double quantidadeKm = 0;
	double CombustivelGasto = 0;
	double KmPL = CombustivelGasto / quantidadeKm;
	String marca;
	String modelo;
	
	public void calculoPercurso() {
		quantidadeKm = 1 + (Math.random() * 49);
		System.out.println("Percurso: " + quantidadeKm);
		totalKm += quantidadeKm;

	}

	public void mostrarTotalKm() {
		System.out.println("Total Km Percorrido: " + totalKm);
	}

	public void mostrarDadosGerais() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Total de Km: " + totalKm);
		System.out.println("Km/L: " + KmPL);
	}
	public void perguntarCombustivel() {
		Scanner sc1 = new Scanner (System.in);
		CombustivelGasto = sc1.nextDouble();
		sc1.close();
	}

	public void mostrarKmPL() {
		System.out.println("KmPL: " + KmPL);
		
	}
}
