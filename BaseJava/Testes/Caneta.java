package Testes;
import java.util.Scanner;

public class Caneta {
	Scanner scanner = new Scanner(System.in);
	
	private String modelo;
	private boolean destampada;
	private float ponta;
	private float tinta;
	
	public Caneta() {
		this.destampada = true;
		this.tinta = 50.4f;
	}
	
	public void setModelo(){
		System.out.println("Digite o modelo da tampa: ");
		this.modelo = scanner.nextLine();
	}
	
	
}
