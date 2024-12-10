package br.com.Bridge.ConversorDeFormatos.bridge;

import br.com.Bridge.ConversorDeFormatos.empregados.Empregado;
import br.com.Bridge.ConversorDeFormatos.empregados.*;
import br.com.Bridge.ConversorDeFormatos.conversor.*;

public class Main {
	public static void main(String[] args) {
		Empregado gerenteDeProjetos = new GerenteDeProejtos(new JSON(), "Andre", 17, 2000);
		gerenteDeProjetos.dados();
		System.out.println("");
		Empregado analista = new Analista(new JSON(), "Henrique", 15, 400);
		analista.dados();
		System.out.println("");
		Empregado secretaria = new Secretaria(new CVS(), "Gabriela", 20, 5000);
		secretaria.dados();
	}
}
