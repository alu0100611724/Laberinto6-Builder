package personajes.clases;


import personajes.estrategias.AgressiveBehaviour;
import personajes.estrategias.IBehaviour;

public class GuerreroFuego extends GuerreroInvisible {
	
	public GuerreroFuego(){
		caracter = '@';
		strategy = new AgressiveBehaviour();
	}
	
	public GuerreroFuego(IBehaviour b) {
		super(b);
		caracter = '@';
	}
	
	public void move() {       
		strategy.moveCommand();
	}
	 
}
