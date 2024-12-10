package br.com.Bridge.BridgeDeFormas.bridge;
import br.com.Bridge.BridgeDeFormas.bridge.cores.*;
import br.com.Bridge.BridgeDeFormas.bridge.formas.*;
import br.com.Bridge.BridgeDeFormas.bridge.estilos.*;


public class Main {
    public static void main(String[] args) {
        Forma circuloVermelho = new Circulo(new Vermelho(), new Solido());
        circuloVermelho.desenhar();
        System.out.println("");
        Forma quadradoAzul = new Quadrado(new Azul(), new Tracejado());
        quadradoAzul.desenhar();
        System.out.println("");
        Forma TrianguloVerde = new Triangulo(new Verde(), new Tracejado());
        TrianguloVerde.desenhar();
    }
}
