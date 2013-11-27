package personajes.estrategias;

public class NormalBehaviour implements IBehaviour {

	public NormalBehaviour() {
		
	}

	@Override
	public void moveCommand() {
		System.out.println("Quieto.");
	}

}
