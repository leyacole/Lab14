
public class Rocky extends Player {
	
	public Rocky(String name) {
		super(name);   //call the constructor in Player
		
	}

	@Override
	public Roshambo generateRoshambo() {
		
		return Roshambo.ROCK;
	}

}
