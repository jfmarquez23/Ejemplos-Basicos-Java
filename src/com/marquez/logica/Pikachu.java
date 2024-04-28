package com.marquez.logica;

public class Pikachu extends Pokemon implements IElectrico {
	
	

	public Pikachu() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy Pikachu y este es mi ataque Placaje ");

	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy Pikachu y este es mi ataque Arañazo ");

	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy Pikachu y este es mi ataque Mordisco ");

	}

	@Override
	public void atacarImpactTrueno() {
		System.out.println("Hola soy Pikachu y este es mi ataque Impactar Trueno ");

	}

	@Override
	public void atacarPunioTrueno() {
		System.out.println("Hola soy Pikachu y este es mi ataque Atacar Puño Trueno ");

	}

}
