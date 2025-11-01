package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;

public class Crocodilo extends Repteis implements Nadador, Corredor, Predador {

	public Crocodilo(String nome, int idade) {
		super(nome, idade, "Placas Dérmicas");
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando mamíferos");
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está correndo atrás de invasores");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está nandando na lagoa");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está rugindo para afastar predadores");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + "está comendo a carne de sua caça");
		
	}

	



}
