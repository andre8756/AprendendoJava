package br.com.exemplo.memento;

import br.com.exemplo.memento.component.TextEditor;
import br.com.exemplo.memento.memory.CareTaker;

public class MementoMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        CareTaker caretaker = new CareTaker();

        editor.setText("Versão 1");
        caretaker.addMemento(editor.saveToMemento());
        
        editor.setText("Versão 2");
        caretaker.addMemento(editor.saveToMemento());

        editor.setText("Versão 3");
        
        System.out.println("Texto atual: " + editor.getText());  // Exibe "Versão 3"

        // Desfazendo duas vezes
        editor.restoreFromMemento(caretaker.getLastMemento());
        System.out.println("Após desfazer uma vez: " + editor.getText());  // Exibe "Versão 2"

       editor.restoreFromMemento(caretaker.getLastMemento());
       System.out.println("Após desfazer duas vezes: " + editor.getText());  // Exibe "Versão 1"
    }
}
