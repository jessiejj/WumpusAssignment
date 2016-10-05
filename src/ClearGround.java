
public class ClearGround extends GameItem {

	public char c = '.';
	char p = '*';
	
	public ClearGround(char c) {
		super(c);
	}

	public char display() {
		return c;
	}
	
	public char displayPlayer() {
		return p;
	}
}
