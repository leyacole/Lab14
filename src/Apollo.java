
public class Apollo extends Player{       //random player

	public Apollo() {
		super();
	}
	
	public Apollo(String name) {
		super(name);
	}
	
	@Override
	public Roshambo generateRoshambo() {
		
		int random =(int)(3*Math.random())+1;
		//int random = (int) Math.random() * 3 + 1;
		System.out.println(random);
		
		if(random == 1) {
			return Roshambo.ROCK;
		}else if (random == 2) {
			return Roshambo.SCISSORS;
		}else {
			return Roshambo.PAPER;
		}
		
	}    
	

}
