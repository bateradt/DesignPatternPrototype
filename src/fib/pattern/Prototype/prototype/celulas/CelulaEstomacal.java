package fib.pattern.Prototype.prototype.celulas;

import fib.pattern.Prototype.prototype.celulas.interfaces.Celula;

/**
 * Implementação da célula do tipo "Estomacal", estendendo a classe "Celula".
 * O método mitose é o responsável por devolver ao demandador o objeto
 * clonado.
 */
public class CelulaEstomacal extends Celula {

	public CelulaEstomacal() {
		tipo = "Estomacal";
	}

	@Override
	public Object mitose() {
		System.out.println("Nova c�lula estomacal criada");
		try {
			return this.clone();
		} catch (CloneNotSupportedException err) {
			return null;
		}
	}
}
