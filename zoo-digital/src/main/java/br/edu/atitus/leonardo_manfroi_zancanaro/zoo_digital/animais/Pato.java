package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Voador;

public class Pato extends Aves implements Voador, Nadador, Predador{

	  public Pato(String nome, int idade, String corPenas) {
	    super(nome, idade, corPenas);
	   
	  }

	  @Override
	  public void emitirSom() {
	    System.out.println(getNome() + " está grasnando");
	  }

	  @Override
	  public void comer() {
	    System.out.println(getNome() + " está comendo plantinhas do lago");
	  }

	  @Override
	  public void nadar() {
	   System.out.println(getNome() + " está nadando");
	  }

	  @Override
	  public void voar() {
	    System.out.println(getNome() + " está voando");
	  }
	  
	  @Override
	  public void cacar() {
		  System.out.println(getNome() + " está caçando insetos");
	  }
	  
	}