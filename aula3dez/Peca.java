package aula3dez;

public class Peca {
	String nome;
	char posAL;
	byte posAN;

	public void ValidacaoDeMovimento(char posDL, byte posDN) {
		switch (nome) {
		case "rei":
			if (posAN + 1 == posDN || posAN - 1 == posDN || posAN == posDN && (posDN > 0 && posDN < 9)) {
				if ((posAL + 1 == posDL || posAL - 1 == posDL || posAL == posDL) && (posDL > 97 && posDL < 105)) {
					System.out.println("Movimento válido");
				} else {
					System.out.println("Movimento inválido");
				}
			} else {
				System.out.println("Movimento inválido");
			}
			break;
		case "torre":
			if ((posAL != posDL && posAN != posDN && posDN > 0 && posDN < 9) 
					&& (posDL > 97 && posDL < 105)) {
				System.out.println("Movimento inválido");
			} else {
				System.out.println("Movimento válido");
			}
			break;
		case "Bispo":
			 int deslocamento = posAN - posDN;
			 char letraPossivel1 = (char) (posAL + deslocamento);
			 char letraPossivel2 = (char) (posAL - deslocamento);
			 
			 if (letraPossivel1 == posDL || letraPossivel2 == posDL) {
				 System.out.println("Movimento válido"); 
			 }else {
					 System.out.println("Movimento inválido");
			 }
			 break;
		default:
			System.out.print("peca inválida");
			break;
		}
	}
}
