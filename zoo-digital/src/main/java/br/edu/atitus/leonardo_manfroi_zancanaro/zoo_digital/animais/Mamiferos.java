package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

public abstract class  Mamiferos extends Animal {
	  private boolean temPelo;

	  public boolean isTemPelo() {
	    return temPelo;
	  }

	  public void setTemPelo(boolean temPelo) {
	    this.temPelo = temPelo;
	  }

	  public Mamiferos(String nome, int idade, boolean temPelo) {
	    super(nome,"Mamifero", idade);
	    this.temPelo = temPelo;
	  }
	  
	  public void amamentar() {
	    System.out.println(this.getNome() + " está amamentando o seu filhote.");
	  }
	  
	}