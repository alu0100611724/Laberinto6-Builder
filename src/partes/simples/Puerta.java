package partes.simples;


public class Puerta implements LugarDelMapa {

	protected Habitacion habitacion1;
	protected Habitacion habitacion2;
	protected boolean estaAbierta;
	
	public Puerta(Habitacion habitacion1, Habitacion habitacion2) {
		this.habitacion1=habitacion1;
		this.habitacion2=habitacion2;
	}
	
	public final Habitacion otroLadoDe(Habitacion habitacion){
		if (habitacion.equals(habitacion1))
			return habitacion2;
		else return habitacion1;
	}
	
	@Override
	public void Entrar() {
		if (estaAbierta) {
			// el jugador deberia aparecer en el otroLadoDe la hab
			habitacion2.Entrar(habitacion1.getPersonaje());
			habitacion1.Entrar();
		} else {
			// el jugador no se mueve de su sitio
			System.out.println("La puerta esta cerrada.");
		}
	}
}
