public abstract class GameItem {

	public char c;
	char p = '*';

	public GameItem(char c) {
		super();
		this.c = c;
	}

	public char display() {
		return c;
	}
	
	public char displayPlayer() {
		return p;
	}
}
