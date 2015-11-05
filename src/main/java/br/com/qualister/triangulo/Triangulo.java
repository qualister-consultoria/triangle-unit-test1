package br.com.qualister.triangulo;

public class Triangulo implements ITriangulo {
	
	public static String calcular(Integer lado1, Integer lado2, Integer lado3) throws TrianguloNaoPreenchidoException {
		String retorno = null;
		
		if (lado1 == null || lado2 == null || lado3 == null) {
			throw new TrianguloNaoPreenchidoException();
		} else if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
			retorno = NAO_E_TRIANGULO;
		} else {
			if (lado1 == lado2 && lado2 == lado3) {
				retorno = TRIANGULO_EQUILATERO;
			} else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
				retorno = TRIANGULO_ISOSCELES;
			} else {
				retorno = TRIANGULO_ESCALENO;
			}			
		}
		return retorno;
		
	}
}
