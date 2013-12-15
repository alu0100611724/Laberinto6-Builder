package builder;

import partes.simples.Habitacion;
import partes.simples.Pared;
import partes.simples.Puerta;
import producto.Laberinto;

/**
 * Esta clase juega el papel del director del builder.
 * @author Mauri
 *
 */
public abstract class JuegoDelLaberinto {
	
	//Metodos de fabricacion
	public Laberinto buildLaberinto() {
		return new Laberinto();
	}
	public abstract Habitacion buildHab(int n);
	public abstract Pared buildPared();
	public abstract Puerta buildPuerta(Habitacion h1, Habitacion h2);
	
}
