public abstract class GameItem {

	char c;
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
