package aula3dez;

public class PecaTeste {
	public static void main (String[]args) {
		Peca peca = new Peca();
	
	peca.nome = "Bispo";
	peca.posAL = 'f';
	peca.posAN = 6;
	
	System.out.println(peca.nome);
	System.out.println(peca.posAL + " " + peca.posAN );
	
	peca.ValidacaoDeMovimento( 'b',(byte) 2 );
	peca.ValidacaoDeMovimento( 'f',(byte) 6 );
	peca.ValidacaoDeMovimento( 'h',(byte) 8 );
	}
}
	
