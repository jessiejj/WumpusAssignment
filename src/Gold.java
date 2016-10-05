
public class Gold extends GameItem {
	
	char c = 'G';
	char p = '*';
	
	public Gold(char c) {
		super(c);
	}
	
	public char display() {
		return c;
	}
	
	public char displayPlayer() {
		return p;
	}
}
