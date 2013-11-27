package concreteBuilder;

import partes.simples.Habitacion;
import partes.sobrecargadas.HabitacionDeElementos;
import builder.JuegoDelLaberinto;

public class JuegoDelLaberintoLuchas extends JuegoDelLaberinto {
	
	public JuegoDelLaberintoLuchas() {
		super();
	}

	public Habitacion fabricarHabitacion(int n) {
		return new HabitacionDeElementos(n);
	}
	
	
}
