package personajes.clases;


import personajes.estrategias.IBehaviour;
import personajes.estrategias.NormalBehaviour;

public class GuerreroPlanta extends GuerreroInvisible {
	
	protected char caracter;
	
	public GuerreroPlanta(){
		caracter = '$';
		strategy = new NormalBehaviour();
	}
	
	public GuerreroPlanta(IBehaviour b) {
		super(b);
		caracter = '$';
	}
	
	public void move() {       
		strategy.moveCommand();
	}
	 
}
