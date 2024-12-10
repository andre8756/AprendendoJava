package br.com.Memento.memory;

import java.util.ArrayList;
import java.util.List;

import br.com.Memento.component.TextEditor;

public class ChamarTexto {
	private List<TextEditor.Memento> saveStates = new ArrayList<>();
	
	public void addMemento(TextEditor.Memento memento) {
		
		if(saveStates.size() > 5) {
			saveStates.remove(saveStates.size() - 1);
			saveStates.add(memento);
		} else{
			saveStates.add(memento);
		}
	}
	
	public TextEditor.Memento getLastMemento(){
		if(saveStates.size() > 0) {
			return saveStates.remove(saveStates.size() - 1);
		} else {
			return null;
		}
	}
}
