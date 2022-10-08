
package projeto_teste01;

public class CaelumExercises {
	public static void main(String[] args) {
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
		while (j < 11) {
			i = 5;
			resultado = i * j;
			System.out.println(i + "*" + j + "=" + resultado);
			j++;
		}

		System.out.println();
		j = 0;
		for (; j < 11; j++) {
			i = 5;
			resultado = i * j;
			System.out.println(i + "*" + j + "=" + resultado);
		}
		System.out.println();

		for (int a = 0; a < 3; a++) {
			System.out.println("Oi.");
			System.out.println("Até.");
		}

	}
}
