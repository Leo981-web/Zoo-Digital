package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;

public class Tubarao extends Peixes implements Nadador, Predador {

	  public Tubarao(String nome, int idade) {
	    super(nome, idade, "Salgada");

	  }

	  @Override
	  public void emitirSom() {
	    System.out.println(getNome() + " está borbulhando");
	  }

	  @Override
	  public void comer() {
	   System.out.println(getNome() + " está comendo peixes");
	  }

	  @Override
	  public void nadar() {
	    System.out.println(getNome() + " está nadando em mar aberto");
	  }
	  
	  @Override
	  public void cacar() {
		  System.out.println(getNome() + " está caçando focas");
	  }
	  
	}
