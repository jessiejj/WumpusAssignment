public class Wumpus extends GameItem {
	
	public char c = 'W';
	char p = '*';
	
	public Wumpus(char c) {
		super(c);
	}

	public char display() {
		return c;
	}
	
	public char displayPlayer() {
		return p;
	}
}
