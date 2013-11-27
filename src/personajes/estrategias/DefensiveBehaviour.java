package personajes.estrategias;

public class DefensiveBehaviour implements IBehaviour {

	public DefensiveBehaviour() {
		
	}

	@Override
	public void moveCommand() {
		System.out.println("Huye.");
	}

}
