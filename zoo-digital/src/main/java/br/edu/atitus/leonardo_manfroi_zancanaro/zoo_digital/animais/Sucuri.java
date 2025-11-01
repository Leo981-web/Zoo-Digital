package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;

public class Sucuri extends Repteis implements Predador, Corredor, Nadador {

	public Sucuri(String nome, int idade) {
		super(nome, idade, "Escamas");
		
	}

	@Override
	public void nadar() {
		System.out.println(getNome() + " está deslizando pelas as águas do rio");
		
	}

	@Override
	public void correr() {
		System.out.println(getNome() + " está deslizando pelas as margens");
		
	}

	@Override
	public void cacar() {
		System.out.println(getNome() + " está caçando peixes e répteis");
		
	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " está silibando para seus predadores");
		
	}

	@Override
	public void comer() {
		System.out.println(getNome() + "está engolindo sua comida");
		
	}

}
