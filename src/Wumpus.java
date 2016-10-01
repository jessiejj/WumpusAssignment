
public class Wumpus extends GameItem {
	int row;
	int col;
	char c = 'W';
	public Wumpus(char c, int row, int col) {
		super(c);
		this.row = row;
		this.col = col;
	}


}
