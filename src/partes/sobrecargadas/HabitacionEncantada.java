package partes.sobrecargadas;

import partes.simples.Habitacion;

public class HabitacionEncantada extends Habitacion {

	protected Hechizo encantamiento;
	
	public HabitacionEncantada(int numHabitacion, Hechizo h) {
		super(numHabitacion);
		encantamiento=h;
	}

	public Hechizo getEncantamiento() {
		return encantamiento;
	}

}
