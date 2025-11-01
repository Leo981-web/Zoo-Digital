package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Voador;

public class DragaoVoador extends Repteis implements Voador, Predador, Corredor {

	public DragaoVoador(String nome, int idade) {
		super(nome, idade, "Escamas");

	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo pelos galhos das árvores");
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando cupins e formigas");
		
	}

	@Override
	public void voar() {
		System.out.println(getNome() + " está planando de árvore em árvore");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está se comunicando atraves de lingagem corparal");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + " está comendo formigas");
		
	}

}
