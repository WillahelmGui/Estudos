package projeto_teste01;

public class Estudo {

	public static void main(String[] args) {
		int idade1 = 22;
		
		int soma = XYZ.idade0 + idade1;
		soma += XYZ.idade0;
		
		XYZ x = new XYZ();
		soma += x.idadeNonStatic;
		
		System.out.println(soma);
	}
}
