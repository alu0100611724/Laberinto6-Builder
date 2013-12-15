package concreteBuilder;

import partes.simples.Habitacion;
import partes.simples.Pared;
import partes.simples.Puerta;
import partes.sobrecargadas.HabitacionDeElementos;
import builder.JuegoDelLaberinto;

public class JuegoDelLaberintoLuchas extends JuegoDelLaberinto {
	
	public Pared buildPared() {
		return new Pared();
	}
	public Puerta buildPuerta(Habitacion h1, Habitacion h2) {
		return new Puerta(h1, h2);
	}

	public Habitacion buildHab(int n) {
		return new HabitacionDeElementos(n);
	}
	
	
}
