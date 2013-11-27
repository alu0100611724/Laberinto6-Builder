package partes.simples;

import personajes.clases.GuerreroInvisible;


public class Habitacion implements LugarDelMapa {

	public static final int NUMLADOS = 4;
	private int numeroHabitacion;
	private final LugarDelMapa lados[] = new LugarDelMapa[NUMLADOS];
	protected GuerreroInvisible personaje;
	
	public Habitacion(int numHabitacion) {
		setNumHabitacion(numHabitacion);
		personaje = new GuerreroInvisible();
	}
	
	public Habitacion(int numHabitacion, GuerreroInvisible personaje) {
		setNumHabitacion(numHabitacion);
		this.personaje = personaje;
	}
	
	public final LugarDelMapa obtenerLado(Direccion direccion){

		switch (direccion) {
			case NORTE: return lados[0];
			case SUR:   return lados[1];
			case ESTE:  return lados[2];
			case OESTE: return lados[3];
		}
		return null;
	}
	
	public final void establecerLado(Direccion direccion, LugarDelMapa lugarDelMapa) {
		switch (direccion) {
			case NORTE: lados[0] = lugarDelMapa;
						break;
			case SUR:   lados[1] = lugarDelMapa;
						break;
			case ESTE:  lados[2] = lugarDelMapa;
						break;
			case OESTE: lados[3] = lugarDelMapa;
						break;
		}
	}
	
	@Override
	public void Entrar() {
		this.personaje = new GuerreroInvisible();
	}
	
	public void Entrar(GuerreroInvisible personaje) {
		this.personaje = personaje;
	}
	
	public GuerreroInvisible getPersonaje() {
		return personaje;
	}

	public int getNumHabitacion() {
		return numeroHabitacion;
	}

	public void setNumHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

}
