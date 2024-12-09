package principioISP;

public class MainImpressora {
	public static void main(String[] args) {
		ImpressoraAvancada impressoraA = new ImpressoraAvancada();
		ImpressoraBasica impressoraB = new ImpressoraBasica();
		
		impressoraA.imprimirImagem();
		impressoraA.imprimirRelatorioFinanceiro();;
		impressoraA.imprimirTexto();
		
		impressoraB.imprimirTexto();
	}
}
