
public abstract class Player {
	
	private String name;
	
	public abstract Roshambo generateRoshambo();
	
	public Roshambo generateRoshambo(String input) {
		return null;
	}
	
	public Player() {  //default constructor
		
	}
	public Player(String name) {
		this.name = name;
	}

	
	public void setName(String name) { 
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
}
	
	


