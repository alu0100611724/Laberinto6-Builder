package partes.simples;

public interface LugarDelMapa {
	/* El significado depender� de d�nde se est� entrando. 
	 * Si se entra en una habitaci�n, cambiar� la posici�n. 
	 * Si tratamos de entrar en una puerta, pueden pasar dos cosas: 
	 * si la puerta est� abierta, se pasar� a la siguiente habitaci�n, 
	 * si la puerta est� cerrada, se tropieza de frente con la puerta.
	 * En un juego real, Entrar podr�a tomar como argumento el objeto jugador que se est� moviendo.
	 * */

	public void Entrar();
}
