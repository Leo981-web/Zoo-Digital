package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Voador;

public class Coruja extends Aves implements Predador, Voador {

	public Coruja(String nome, int idade, String corPenas) {
		super(nome, idade, corPenas);
		
	}

	@Override
	public void voar() {
		System.out.println(getNome() + " está voando na noite");
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando um rato na floresta");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está chirriando no alto de uma árvore");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo insetos que caçou");
		
	}

}
