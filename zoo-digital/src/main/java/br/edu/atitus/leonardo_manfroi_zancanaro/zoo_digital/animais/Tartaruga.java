package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;

public class Tartaruga extends Repteis implements Nadador {

	public Tartaruga(String nome, int idade) {
		super(nome, idade, "Carapaça");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nandando em mar aberto");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está grunhindo para outros peixes");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo algas marinhas");
		
	}

}
