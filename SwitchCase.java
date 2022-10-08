package projeto_teste01;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String uf = sc.next();
		sc.close();
		
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
}
