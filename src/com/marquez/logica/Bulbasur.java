package com.marquez.logica;

public class Bulbasur extends Pokemon implements IPlanta {

	public Bulbasur() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("Hola soy Bulbasur y este es mi ataque Placaje ");

	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("Hola soy Bulbasur y este es mi ataque Arañazo ");

	}

	@Override
	protected void atacarMordisco() {
		System.out.println("Hola soy Bulbasur y este es mi ataque Mordisco ");

	}

	// MetodosPropios

	@Override
	public void atacarDrenaje() {
		System.out.println("Hola soy Bulbasur y este es mi ataque Drenaje ");

	}

	@Override
	public void atacarParalizar() {
		System.out.println("Hola soy Bulbasur y este es mi ataque Paralizar ");

	}

}
