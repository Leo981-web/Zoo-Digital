package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;

public class Gato extends Mamiferos implements Predador, Corredor {

	public Gato(String nome, int idade) {
		super(nome, idade, true);
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo pela a casa");
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um ratinho");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está miando para seu dono");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo sua ração");
		
	}

}
