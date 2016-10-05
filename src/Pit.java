
public class Pit extends GameItem {
	
	public char c = 'P';
	char p = '*';

	public Pit(char c) {
		super(c);
	}

	public char display() {
		return c;
	}
	
	public char displayPlayer() {
		return p;
	}
}
