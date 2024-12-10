package br.com.Memento.memory;

import br.com.Memento.component.*;

import java.util.ArrayList;
import java.util.List;


public class CareTaker {
    private List<TextEditor.Memento> savedStates = new ArrayList<>();

    // Adiciona um novo memento � lista
    public void addMemento(TextEditor.Memento memento) {
    	if(savedStates.size() > 5) {
    		savedStates.remove(savedStates.size() - 1);
    		savedStates.add(memento);
		} else{
			savedStates.add(memento);
		}
    }

    // Recupera o �ltimo memento salvo e remove-o da lista
    public TextEditor.Memento getLastMemento() {
        if (savedStates.size() > 0) {
            return savedStates.remove(savedStates.size() - 1);
        }
        return null;
    }
}