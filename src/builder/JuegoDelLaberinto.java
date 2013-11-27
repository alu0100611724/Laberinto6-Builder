package builder;

import partes.simples.Direccion;
import partes.simples.Habitacion;
import partes.simples.Pared;
import partes.simples.Puerta;
import personajes.clases.GuerreroAgua;
import personajes.clases.GuerreroFuego;
import personajes.clases.GuerreroInvisible;
import producto.Laberinto;

public class JuegoDelLaberinto {

	/* Codigo sin aplicar Factory Method
	 * public final Laberinto crearLaberinto() {
		Laberinto unLaberinto = new Laberinto();
		Habitacion h1 = new Habitacion(1);
		Habitacion h2 = new Habitacion(2);
		unLaberinto.anadirHabitacion(h1);
		unLaberinto.anadirHabitacion(h2);
		Puerta laPuerta = new Puerta(h1, h2);
		h1.establecerLado(Direccion.NORTE, new Pared());
		h1.establecerLado(Direccion.ESTE, laPuerta);
		h1.establecerLado(Direccion.SUR, new Pared());
		h1.establecerLado(Direccion.OESTE, new Pared());
		h2.establecerLado(Direccion.NORTE, new Pared());
		h2.establecerLado(Direccion.ESTE, new Pared());
		h2.establecerLado(Direccion.SUR, new Pared());
		h2.establecerLado(Direccion.OESTE, laPuerta);
		return unLaberinto;
	}*/
	
	// Metodos de fabricacion
	public Laberinto fabricarLaberinto() {
		return new Laberinto();
	}
	public Habitacion fabricarHabitacion(int n) {
		return new Habitacion(n);
	}
	public Pared fabricarPared() {
		return new Pared();
	}
	public Puerta fabricarPuerta(Habitacion h1, Habitacion h2) {
		return new Puerta(h1, h2);
	}
	
	public final Laberinto crearLaberinto() {
		
		Laberinto unLaberinto = fabricarLaberinto();
		
		Habitacion h1 = fabricarHabitacion(1);
		Habitacion h2 = fabricarHabitacion(2);
		Habitacion h3 = fabricarHabitacion(2);
		Habitacion h4 = fabricarHabitacion(2);
		
		unLaberinto.anadirHabitacion(h1);
		unLaberinto.anadirHabitacion(h2);
		unLaberinto.anadirHabitacion(h3);
		unLaberinto.anadirHabitacion(h4);
		
		Puerta laPuerta1 = fabricarPuerta(h1, h2);
		Puerta laPuerta2 = fabricarPuerta(h1, h3);
		Puerta laPuerta3 = fabricarPuerta(h2, h4);
		
		
		h1.Entrar(new GuerreroFuego()); 
		h1.establecerLado(Direccion.NORTE, fabricarPared());
		h1.establecerLado(Direccion.ESTE, laPuerta1);
		h1.establecerLado(Direccion.SUR, laPuerta2);
		h1.establecerLado(Direccion.OESTE, fabricarPared());
		
		h2.Entrar(new GuerreroAgua());  
		h2.establecerLado(Direccion.NORTE, fabricarPared());
		h2.establecerLado(Direccion.ESTE, fabricarPared());
		h2.establecerLado(Direccion.SUR, fabricarPared());
		h2.establecerLado(Direccion.OESTE, laPuerta1);
		
		h3.Entrar(new GuerreroInvisible());  
		h3.establecerLado(Direccion.NORTE, laPuerta2);
		h3.establecerLado(Direccion.ESTE, fabricarPared());
		h3.establecerLado(Direccion.SUR, fabricarPared());
		h3.establecerLado(Direccion.OESTE, fabricarPared());
		
		h4.Entrar(new GuerreroInvisible());  
		h4.establecerLado(Direccion.NORTE, laPuerta3);
		h4.establecerLado(Direccion.ESTE, fabricarPared());
		h4.establecerLado(Direccion.SUR, fabricarPared());
		h2.establecerLado(Direccion.OESTE, fabricarPared());
		return unLaberinto;
	}
	
}
