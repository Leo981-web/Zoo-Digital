package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Corredor;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Nadador;
import br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.comportamentos.Predador;

public class Cachorro extends Mamiferos implements Corredor, Nadador, Predador	 {

	  public Cachorro(String nome, int idade) {
	    super(nome, idade, true);
	    
	  }

	  @Override
	  public void emitirSom() {
	    System.out.println(getNome() + " está latindo");
	  }

	  @Override
	  public void comer() {
	    System.out.println(getNome() + " está comendo sua ração");
	  }

	  @Override
	  public void nadar() {
	    System.out.println(getNome() + " está nadando no lago ");
	  }

	  @Override
	  public void correr() {
	    System.out.println(getNome() + " está correndo atras de uma borboleta");
	  }
	  
	  @Override
	  public void cacar() {
		  System.out.println(getNome() + " está caçando o chinelo do dono");
	  }
	  
	}