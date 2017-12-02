package fib.pattern.Prototype.prototype.celulas;

import fib.pattern.Prototype.prototype.celulas.interfaces.Celula;

public class Neuronio extends Celula {

	public Neuronio() {
		tipo = "neuronio";
	}

	@Override
	public Object mitose() {
		System.out.println("Novo neurônio criado");
		try {
			return this.clone();
		} catch (CloneNotSupportedException err) {
			return null;
		}
	}

}
