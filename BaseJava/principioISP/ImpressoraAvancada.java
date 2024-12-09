package principioISP;

public class ImpressoraAvancada implements ImprimirTexto, ImprimirImagem, ImprimirRelatorioFinanceiro{
	 public void imprimirTexto() {
	        System.out.println("Imprimindo texto.");
	    }

	    public void imprimirImagem() {
	        System.out.println("Imprimindo Imagem.");
	    }

	    public void imprimirRelatorioFinanceiro() {
	        System.out.println("Imprimindo Relatorio Financeiro.");
	    }
}
