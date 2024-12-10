package br.com.Bridge.BridgeDeFormas.bridge.formas;

import br.com.Bridge.BridgeDeFormas.bridge.cores.Cor;
import br.com.Bridge.BridgeDeFormas.bridge.estilos.Estilo;


//Abstra��o Refinada para um Quadrado
public class Quadrado extends Forma {
 public Quadrado(Cor cor, Estilo estilo) {
     super(cor, estilo);
 }

 @Override
 public void desenhar() {
     System.out.print("Desenhando um quadrado com ");
     cor.aplicarCor();
     estilo.aplicarEstilo();
 }
}
