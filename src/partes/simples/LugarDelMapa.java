package partes.simples;

public interface LugarDelMapa {
	/* El significado dependerá de dónde se esté entrando. 
	 * Si se entra en una habitación, cambiará la posición. 
	 * Si tratamos de entrar en una puerta, pueden pasar dos cosas: 
	 * si la puerta está abierta, se pasará a la siguiente habitación, 
	 * si la puerta está cerrada, se tropieza de frente con la puerta.
	 * En un juego real, Entrar podría tomar como argumento el objeto jugador que se está moviendo.
	 * */

	public void Entrar();
}
