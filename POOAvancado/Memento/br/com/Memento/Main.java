package br.com.Memento;

import br.com.Memento.component.TextEditor;
import br.com.Memento.memory.CareTaker;

public class Main {
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		CareTaker caretaker = new CareTaker();
		
		editor.setText("Versao 1");
		caretaker.addMemento(editor.saveToMemento());
		
		editor.setText("Versao 2");
		caretaker.addMemento(editor.saveToMemento());
		
		editor.setText("Versao 3");
		caretaker.addMemento(editor.saveToMemento());
		
		editor.setText("Versao 4");
		caretaker.addMemento(editor.saveToMemento());
		
		editor.setText("Versao 5");
		caretaker.addMemento(editor.saveToMemento());
		
		editor.setText("Versao 6");
		caretaker.addMemento(editor.saveToMemento());
		
		System.err.println("Texto atual: "+editor.getText());
		
		editor.restoreFromMemento(caretaker.getLastMemento());
		System.out.println("Apos desfazer uma vez: "+editor.getText());
	}
}
