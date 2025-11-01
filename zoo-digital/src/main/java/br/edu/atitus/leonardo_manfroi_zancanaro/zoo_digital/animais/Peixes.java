package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

public abstract class Peixes extends Animal {
	  private String tipoAgua;

	  public String getTipoAgua() {
	    return tipoAgua;
	  }

	  public void setTipoAgua(String tipoAgua) {
	    this.tipoAgua = tipoAgua;
	  }

	  public Peixes(String nome, int idade, String tipoAgua) {
	    super(nome, "Peixes", idade);
	    this.tipoAgua = tipoAgua;
	  }

	}

