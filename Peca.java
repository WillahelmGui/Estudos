package aula3dez;

public class Peca {
	String nome;
	char posAL;
	byte posAN;
	char posDL;
	byte posDN;

	public void ValidacaoDeMovimento() {
		if(posAN + 1 == posDN || posAN -1 == posDN || posAN == posDN && (posDN > 0 && posDN < 9)) {
			if((posAL + 1 == posDL || posAL - 1 == posDL|| posAL == posDL) && (posDL > 97 && posDL < 105)) {
			System.out.println("Movimento válido");
			} else {
				System.out.println("Movimento inválido");
			}
		} else {
			System.out.println("Movimento inválido");
		}
	
	} 
}

