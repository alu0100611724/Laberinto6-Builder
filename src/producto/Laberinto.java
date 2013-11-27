package producto;

import java.util.ArrayList;

import partes.simples.Habitacion;

public class Laberinto {

	protected ArrayList<Habitacion> habitaciones;
	
	public Laberinto() {
		habitaciones = new ArrayList<Habitacion>();
	}
	
	public final void anadirHabitacion(Habitacion habitacion) {
		habitaciones.add(habitacion);
	}
	
	public final Habitacion numeroDeHabitacion(int numero) {
		
		for (int i=0; i<habitaciones.size(); i++)
			if (habitaciones.get(i).getNumHabitacion() == numero)
				return habitaciones.get(i);
		return null;
	}
	
	public void play(){
		//Debe llamar a la funcion pintar de habitaciones mientras el juego no se acabe
		System.out.println(" ************** ");
		System.out.println(" *     **     * ");
		System.out.println(" *  @  ||     * ");
		System.out.println(" *     **     * ");
		System.out.println(" ***-******-*** ");
		System.out.println(" ***-******-*** ");
		System.out.println(" *     **     * ");
		System.out.println(" *     **  &  * ");
		System.out.println(" *     **     * ");
		System.out.println(" ************** ");
	}

}
