package com.marquez.logica;

public abstract class Pokemon {
	protected int num_pokedex;
	protected String nombre_pokemon;
	protected double peso;
	protected String sexo;
	protected int temporada;

	// Declaracion metodos abstractos
	protected abstract void atacarPlacaje();

	protected abstract void atacarAraniazo();

	protected abstract void atacarMordisco();

}
