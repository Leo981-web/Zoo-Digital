package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;

public class Pinguin extends Aves implements Nadador, Corredor, Predador {

	  public Pinguin(String nome, int idade, String corPenas) {
	    super(nome, idade, corPenas);
	    
	  }

	  @Override
	  public void emitirSom() {
	    System.out.println(getNome() + " está braminhando");
	  }

	  @Override
	  public void comer() {
	   System.out.println(getNome() + " está comendo peixes");
	  }

	  @Override
	  public void correr() {
	    System.out.println(getNome() + " está correndo de forma desajeitada");
	  }

	  @Override
	  public void nadar() {
	    System.out.println(getNome() + " está nadando para caçar");
	  }
	  
	  @Override
	  public void cacar() {
		  System.out.println(getNome() + " está caçando crustáceos no mar");
	  }
	  
	}
