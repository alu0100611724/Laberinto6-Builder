package concreteBuilder;

import partes.simples.Habitacion;
import partes.simples.Pared;
import partes.simples.Puerta;
import partes.sobrecargadas.HabitacionEncantada;
import partes.sobrecargadas.Hechizo;
import partes.sobrecargadas.PuertaQueNecesitaHechizo;
import builder.JuegoDelLaberinto;

public class JuegoDelLaberintoEncantado extends JuegoDelLaberinto {
	
	private int idHechizos;
	
	//cada puerta hechizada necesita un hechizo parar abrirla, que puede estar en cualquier parte del laberinto
	public JuegoDelLaberintoEncantado() {
		this.idHechizos = 0;
	}

	public Habitacion buildHab(int n) {
		return new HabitacionEncantada(n, Hechizar());
	}
	public Pared buildPared() {
		return new Pared();
	}
	
	//Una puerta encantada posee un unico hechizo que la abrira
	public Puerta buildPuerta(Habitacion h1, Habitacion h2) {
		return new PuertaQueNecesitaHechizo(h1, h2, new Hechizo(idHechizos));
	}
	
	//se utiliza para abrir una puerta encantada especifica
	protected final Hechizo Hechizar() {
		return new Hechizo(idHechizos++);
		
	}
}
