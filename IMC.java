package projeto_teste01;

import java.util.Scanner ;
public class IMC {
	public static void main(String[]args) {
		Scanner sc1 = new Scanner(System.in); 
		
		double massa = sc1.nextDouble() ;
		double altura = sc1.nextDouble() ;
		
		double imc ;
		imc = massa/(altura*altura);
		System.out.println("O seu IMC é " + imc + ".");
		
		if(imc < 18.5) {
			System.out.println("seu índice é: Magreza.");
		}
		
		if (imc >= 18.5 && imc < 24.9) {
		System.out.println("Seu índice é: Normal.");
				
		}
		
		if (imc >= 24.9 && imc < 30) {
			System.out.println("Seu índice é: Sobrepeso.");
		}
	
		if (imc > 30) {
			System.out.println("Seu índice é: Obwseidade");
		}
	}	
}
