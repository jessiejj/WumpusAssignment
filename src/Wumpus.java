public class Wumpus extends GameItem {
	
	char c = 'W';
	
	public Wumpus(char c) {
		super(c);
	}

	public char display() {
		return c;
	}
}
