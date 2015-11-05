package br.com.qualister.triangulo;

public class TrianguloNaoPreenchidoException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public TrianguloNaoPreenchidoException() {
		super("Lado não preenchido!");
	}
}
