package desafioFacil;

import java.util.Scanner;

public class Teste {
	public static void main(String[] Args) {
		Scanner sc1 = new Scanner(System.in);
		
		Carro c1 = new Carro();
		
		c1.marca = sc1.nextLine();
		c1.modelo = sc1.nextLine();
		c1.perguntarCombustivel();
		for (int i = 0; i < 5; i++)
			c1.calculoPercurso();
		c1.mostrarTotalKm();
		c1.mostrarKmPL();
		
		System.out.println("=======================");
		
		Carro c2 = new Carro();
		
		c2.marca = sc1.nextLine();
		c2.modelo = sc1.nextLine();
		c2.perguntarCombustivel();
		for (int j = 0; j <  5; j++)
			c2.calculoPercurso();
		c2.mostrarTotalKm();
		c2.mostrarKmPL();
	
	sc1.close();
	}
}