package br.com.Bridge.BridgeDeFormas.bridge.formas;

import br.com.Bridge.BridgeDeFormas.bridge.cores.*;

import br.com.Bridge.BridgeDeFormas.bridge.estilos.Estilo;

//Abstra��o Refinada para um C�rculo
public class Circulo extends Forma {
 public Circulo(Cor cor, Estilo estilo) {
     super(cor, estilo);
 }

 @Override
 public void desenhar() {
     System.out.print("Desenhando um c�rculo ");
     cor.aplicarCor();
     estilo.aplicarEstilo();
 }
}