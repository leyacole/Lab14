
public class Leya extends Player{
	
	public Roshambo generateRoshambo(String input) {
		
		if(input.equalsIgnoreCase("rock")) {
			return Roshambo.ROCK;
	    }else if (input.equalsIgnoreCase("scissors")) {
	    	return Roshambo.SCISSORS;
	    }else {
	    	return Roshambo.PAPER;
	    }
	}
		
	public Leya() {
		super();
	}
	
	public Leya(String name) {
		super(name);
	}
	
	
	@Override
	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}

}
