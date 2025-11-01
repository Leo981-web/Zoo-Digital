package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

public abstract class Aves extends Animal {
	  private String corPenas;

	  public String getCorPenas() {
	    return corPenas;
	  }

	  public void setCorPenas(String corPenas) {
	    this.corPenas = corPenas;
	  }

	  public Aves(String nome, int idade, String corPenas) {
	    super(nome, "Aves", idade); 
	    this.corPenas = corPenas;
	  }

	  public void botarOvo() {
	    System.out.println(getNome() + "Está botando ovo");
	  }
	}
