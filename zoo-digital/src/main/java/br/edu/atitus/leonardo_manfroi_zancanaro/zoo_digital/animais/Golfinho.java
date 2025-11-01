package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;

public class Golfinho extends Mamiferos implements Nadador, Predador {

	  public Golfinho(String nome, int idade) {
	    super(nome, idade, false);
	    
	  }

	  @Override
	  public void emitirSom() {
	    System.out.println(getNome() + " está assoviando.");
	  }

	  @Override
	  public void comer() {
	   System.out.println(getNome() + " está comendo peixes.");
	  }

	  @Override
	  public void nadar() {
	    System.out.println(getNome() + "está nadando Lindamente");;
	  }
	  
	  @Override
	  public void cacar() {
		  System.out.println(getNome() + "está caçando peixinhos");
	  }
	}