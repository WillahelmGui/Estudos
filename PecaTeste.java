package aula3dez;

public class PecaTeste {
	public static void main (String[]args) {
		Peca peca = new Peca();
	
	peca.nome = "Rei";
	peca.posAL = 'h';
	peca.posAN = 8;
	
	peca.posDL = 'h';
	peca.posDN = 7;
	
	System.out.println(peca.nome);
	System.out.println(peca.posAL + " " + peca.posAN );
	System.out.println(peca.posDL + " "+ peca.posDN);	
	peca.ValidacaoDeMovimento();
	}
}
	
