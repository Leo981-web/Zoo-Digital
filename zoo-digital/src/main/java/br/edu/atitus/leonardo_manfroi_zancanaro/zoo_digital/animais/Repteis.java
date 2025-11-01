package br.edu.atitus.leonardo_manfroi_zancanaro.zoo_digital.animais;

public abstract class Repteis extends Animal {
	
	private String tipoCobertura;
	
	public Repteis(String nome, int idade, String tipoCobertura) {
		super(nome, "Reptil" , idade);
	}
	
	
	  
	public void regularTemperaturaCorporal() {
		System.out.println(getNome() + " Está tomando sol para regular sua temperatura");
	}



	public String getTipoCobertura() {
		return tipoCobertura;
	}



	public void setTipoCobertura(String tipoCobertura) {
		this.tipoCobertura = tipoCobertura;
	}




}