package Lista13OCPLojaVirtual;

import java.util.ArrayList;


public class CalculadoraDesconto {
	
	private ArrayList<Produto> produtos = new ArrayList<Produto>();	
	private ArrayList<Desconto> descontos = new ArrayList<Desconto>();
	
	public double calcularDesconto(Produto produto, Desconto desconto) {
	        return desconto.calcularDesconto(produto);
	}
	
	public double calcularDescontoTotal() {
        double totalDesconto = 0;
        for (int i = 0; i < this.produtos.size(); i++) {
            totalDesconto += this.descontos.get(i).calcularDesconto(this.produtos.get(i));
        }
        return totalDesconto;
    }
	
	public void addDesconto(Desconto desconto) {
		descontos.add(desconto);
	}
	
	public void addProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}

	public ArrayList<Desconto> getDescontos() {
		return descontos;
	}

	public void setDescontos(ArrayList<Desconto> descontos) {
		this.descontos = descontos;
	}
	
	
	
}
