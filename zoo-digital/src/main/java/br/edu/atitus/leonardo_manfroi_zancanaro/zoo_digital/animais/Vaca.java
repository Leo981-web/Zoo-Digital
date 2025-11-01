package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Corredor;

public class Vaca extends Mamiferos implements Corredor  {

	public Vaca(String nome, int idade) {
		super(nome, idade, true);
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está mugindo");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo pasto no campo");
	}
	
	public void correr() {
		System.out.println(getNome() + " está correndo no planalto");
	}

}
