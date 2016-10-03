public abstract class GameItem {
	
public GameItem gameItem;
	
	char c;

	public GameItem(char c) {
		super();
		this.c = c;
	}

	public abstract void display();
}
