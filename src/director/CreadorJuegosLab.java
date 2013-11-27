package director;

import concreteBuilder.JuegoDelLaberintoEncantado;
import concreteBuilder.JuegoDelLaberintoLuchas;
import producto.Laberinto;
import builder.JuegoDelLaberinto;

public class CreadorJuegosLab {

	public Laberinto CreaHogwarts() {
		JuegoDelLaberinto encantado = new JuegoDelLaberintoEncantado();
		Laberinto castillo = encantado.crearLaberinto();
		return castillo;
	}
	
	public  Laberinto CreaKombats() {
		JuegoDelLaberinto kombats = new JuegoDelLaberintoLuchas();
		Laberinto mundo = kombats.crearLaberinto();
		return mundo;
	}
}
