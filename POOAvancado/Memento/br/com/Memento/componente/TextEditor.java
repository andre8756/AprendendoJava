package br.com.Memento.componente;

public class TextEditor {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public Memento salvarMemento() {
		return new Memento(text);
	}
	
	public void restoreFromMemento(Memento memento) {
		text = memento.getMemento();
	}
	
	public static class Memento{
		private final String text;
		
		public Memento(String text) {
			this.text = text;
		}
		
		public String getMemento() {
			return text;
		}
		
	}
	
}
