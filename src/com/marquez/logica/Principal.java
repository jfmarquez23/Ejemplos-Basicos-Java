package com.marquez.logica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Squirtle squirtle = new Squirtle();
		Pikachu pikachu = new Pikachu();
		Charmander charmander = new Charmander();
		Bulbasur bulbasur = new Bulbasur();

		squirtle.atacarAraniazo();
		squirtle.atacarHidrobomba();

		charmander.atacarAraniazo();
		charmander.atacarLanzaLlamas();

		bulbasur.atacarAraniazo();
		bulbasur.atacarDrenaje();

		pikachu.atacarImpactTrueno();
		pikachu.atacarMordisco();

	}

}
