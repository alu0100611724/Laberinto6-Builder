package personajes.clases;


import personajes.estrategias.DefensiveBehaviour;
import personajes.estrategias.IBehaviour;

public class GuerreroAgua extends GuerreroInvisible {
	
	protected char caracter;
	
	public GuerreroAgua(){
		caracter = '&';
		strategy = new DefensiveBehaviour();
	}
	
	public GuerreroAgua(IBehaviour b) {
		super(b);
		caracter = '&';
	}
	
	public void move() {       
		strategy.moveCommand();
	}
	 
}
