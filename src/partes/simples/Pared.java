package partes.simples;


public class Pared implements LugarDelMapa {

	@Override
	public void Entrar() {
		// No pasa nada, personaje no se puede mover
		System.out.println("Acaba de darte contra la pared. Muevete a otro lado.");
	}

}
