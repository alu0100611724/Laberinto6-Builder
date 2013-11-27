package partes.sobrecargadas;

import java.util.Calendar;
import java.util.Random;

import partes.simples.Habitacion;

public class HabitacionDeElementos extends Habitacion {
	private String tipoHabitacion;
	
	public HabitacionDeElementos(int numHabitacion) {
		super(numHabitacion);
		switch (numAleatorio()) {
			case 0: tipoHabitacion="Agua";
					break;
			case 1: tipoHabitacion="Fuego";
					break;
			case 2: tipoHabitacion="Hierba";
					break;
		}
	}

	public String getTipoHab() {
		return tipoHabitacion;
	}
	
	// Calcula un numero aleatorio entre 0 y 2 incluidos
	public int numAleatorio () {
		Calendar calendario = Calendar.getInstance();
		int semilla = calendario.hashCode();
		Random r = new Random();
	    r.setSeed(semilla);
		return (r.nextInt(3));
	}

}
