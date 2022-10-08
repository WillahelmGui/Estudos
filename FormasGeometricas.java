package projeto_teste01;

import java.util.Scanner;

public class FormasGeometricas {
	static Scanner sc1 = new Scanner(System.in);
	
	
	public static void calcularFormaGeo() {
	byte formaGeo;	
	System.out.println("Digite um númnero para escolher a opcao");
	System.out.println("1 - Quadrado");
	System.out.println("2 - Trapézio");
	System.out.println("3 - Triângulo Equilátero");
	System.out.println("4 - Retângulo");
	System.out.println("5 - Triângulo Qualquer");
	System.out.println("6 - Paralelogramo");
	System.out.println("7 - Losângulo");
	System.out.println("8 - Círculo");
	System.out.println("0 - Sair");
	formaGeo = sc1.nextByte();
	
	switch(formaGeo) {
	case 1: 
		System.out.println("Digite as medidas do quadrado");
		int medidaQuadrado = sc1.nextInt();
		int resultado = medidaQuadrado * medidaQuadrado;
		System.out.println("Seu resultado é: " + resultado);
		
		
	}
	}
	
}
