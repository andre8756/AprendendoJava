package Aula1.copy;

public class ContaBancaria {
	private int numero;
	private String titular;
	private double saldo;
	
	ContaBancaria(){
	}
	ContaBancaria(int n, String t, double s){
		numero = n;
		titular = t;
		saldo = s;
	}
	
	void setDepostio(double valor) {
		this.saldo = valor+this.saldo;
	}
	void setSaque(double valor){
		this.saldo = this.saldo-valor;
	}
	void setTransferencia(ContaBancaria OutraConta, double valor) {
		if(valor <= saldo) {
			setSaque(valor);
			OutraConta.setDepostio(valor);
		}else {
			System.out.println("Transferência não realizada. O saldo não e suficiente");
		}
	}
	void getStatus() {
		System.out.println("Numero da conta: "+this.numero);
		System.out.println("Titular: "+this.titular);
		System.out.println("Saldo: "+this.saldo);
	}
}
