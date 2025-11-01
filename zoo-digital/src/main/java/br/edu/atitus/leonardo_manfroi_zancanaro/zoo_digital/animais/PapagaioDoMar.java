package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Voador;

public class PapagaioDoMar extends Aves implements Nadador, Predador, Voador {

	public PapagaioDoMar(String nome, int idade, String corPenas) {
		super(nome, idade, corPenas);
	}

	@Override
	public void voar() {
		System.out.println(getNome() + " está voando baixo");
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando arenque");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está mergulhando no oceano");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está grasnido para outros membros do bando");
		 
	}

	@Override
	public void comer() {
		System.out.println(getNome() + "está comendo peixes que caçou");
		
	}
 
}
