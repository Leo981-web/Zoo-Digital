package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;

public class Pirarocu extends Peixes implements Predador, Nadador {

	public Pirarocu(String nome, int idade) {
		super(nome, idade, "Doce");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nadando no rio");
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando outros peixes");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está borbulhando");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo peixes e crustáceos");
		
	}

}
