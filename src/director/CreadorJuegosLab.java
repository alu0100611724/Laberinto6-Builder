package director;

import builder.JuegoDelLaberinto;

/**
 * Clase que representa el roll de director del patron builder.
 * @author Mauri
 *
 */
public class CreadorJuegosLab {

	JuegoDelLaberinto builder;
	CreadorJuegosLab(JuegoDelLaberinto obj){
		builder=obj;
	}
}
