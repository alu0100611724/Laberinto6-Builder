package director;

import builder.JuegoDelLaberinto;

/**
 * Clase que representa el roll de director del patron builder.
 * @author Mauri
 *
 */
public class CreadorJuegosLab {

	JuegoDelLaberinto builder;
	public CreadorJuegosLab(JuegoDelLaberinto builder){
		this.builder=builder;
	}
}
