package br.com.Memento;

import br.com.Memento.component.*;
import br.com.Memento.memory.*;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        editor.setText("Vers�o 1");
        caretaker.addMemento(editor.saveToMemento());
        
        editor.setText("Vers�o 2");
        caretaker.addMemento(editor.saveToMemento());

        editor.setText("Vers�o 3");
        
        System.out.println("Texto atual: " + editor.getText());  // Exibe "Vers�o 3"

        // Desfazendo duas vezes
        editor.restoreFromMemento(caretaker.getLastMemento());
        System.out.println("Ap�s desfazer uma vez: " + editor.getText());  // Exibe "Vers�o 2"

       editor.restoreFromMemento(caretaker.getLastMemento());
       System.out.println("Ap�s desfazer duas vezes: " + editor.getText());  // Exibe "Vers�o 1"
    }
}
