 import java.util.*;
 import java.util.Scanner;
 import java.util.Random;

public class Game { //has 2d array of GameItem called board
	
	Scanner sc = new Scanner(System.in);
	public int selection;					// user menu choice
	private int row;
	private int col;
	private GameItem[][] board = new GameItem[4][4];
	public int playerScore = 0;
	// player x and y coords
	private int playerPosiX;
	private int playerPosiY;
	public boolean isAlive = true;
	Random randomGenerator = new Random();
	public String player = "*";
	
	public void runGame() {
		// setBoard
		//display the board
		//check score
		//sense nearby
		// present menu
		//process user decision
		//display board again
		setBoard();
		while (isAlive == true) {
			display();
			checkScore();
			menu();
		}

			
	}

	//instantiates game board
	//instantiates objects on the game board
	public void setBoard() {
		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length; col++) {
			}	
		}
//		check if the index generated is null, if yes place Wumpus
		while (true) {
		int wX = randomGenerator.nextInt(4);
		int wY = randomGenerator.nextInt(4);
			if (board[wX][wY]==(null)){
				board[wX][wY] = new Wumpus('W');	
			}
			break;
		}
//		check if index generated is null, if yes place Pit
//		repeat until 3 pits reached
		int pitCount = 0;		
		while (pitCount <3){
			int pX = randomGenerator.nextInt(4);
			int pY = randomGenerator.nextInt(4);
				if (board[pX][pY]==(null)){
					board[pX][pY] = new Pit('P');	
					pitCount ++;
				}
		}
		int goldCount = 0;		
		while (goldCount <3){
			int gX = randomGenerator.nextInt(4);
			int gY = randomGenerator.nextInt(4);
				if (board[gX][gY]==(null)){
					board[gX][gY] = new Gold('G');
					goldCount ++;
				}
		}
		int clearGroundCount = 0;		
		while (clearGroundCount <9){
			int cGX = randomGenerator.nextInt(4);
			int cGY = randomGenerator.nextInt(4);
				if (board[cGX][cGY]==(null)){
					board[cGX][cGY] = new ClearGround('.');
					clearGroundCount ++;
				}
		}
//		GOTTA FIGURE THIS OUT - I think the player the coords exist, but i cant display the location
//		generate player position
//		while (true){
//			int playerPosiX = randomGenerator.nextInt(4);
//			int playerPosiY = randomGenerator.nextInt(4);
//			if (board[playerPosiX][playerPosiY].c=='.'){
//				System.out.print(board[row][col].displayPlayer() + " ");
//				
//			}
//			break;
//		}
	}

	//display the game board
	public void display() {
		for(row = 0; row < board.length; row++) {
			for(col = 0; col < board.length; col++) {
				System.out.print(board[row][col].display() + " ");
			}
			System.out.println();
		}
	}
	
	public void  menu() {
		// switch based on other menus i've got
		boolean menuActive = true; // menu loop
	    	while (menuActive){
	    		System.out.println("=====Wumpus===== ");
	    		System.out.println("1. Move player left");
	    		System.out.println("2. Move player right");
	    		System.out.println("3. Move player up");
	    		System.out.println("4. Move player down");
	    		System.out.println("9. Quit");
	    		System.out.println("================");
	    		selection = sc.nextInt();
	    			switch(selection)
	    			{
	    			case 1:
	    				moveLeft();
	    				break;
	    			case 2:
	    				moveRight();
	    				break;
	    			case 3:
	    				moveUp();
	    				break;
	    			case 4:
	    				moveDown();
	    				break;
	    			case 9:menuActive = false;
		                break;
	    			default:
	    				System.out.println("Invalid selection");	
	    		}
	    	}
	}
	
	public void moveLeft(){
		if (playerPosiY == 0) {
				playerPosiY = playerPosiY + 3;
		}
		else {
			playerPosiY = playerPosiY -  1;
		}
	}
	public void moveRight(){
		if (playerPosiY == 3) {
				playerPosiY = playerPosiY - 3;
		}
		else {
			playerPosiY = playerPosiY +  1;
		}
	}
	public void moveUp(){
		if (playerPosiX == 0) {
				playerPosiY = playerPosiY + 3;
		}
		else {
			playerPosiY = playerPosiY -  1;
		}
	}
	public void moveDown(){
		if (playerPosiY == 3) {
				playerPosiY = playerPosiY - 3;
		}
		else {
			playerPosiY = playerPosiY +  1;
		}
	}
	int checkScore() {
		if (board[playerPosiX][playerPosiY].c=='G'){
			playerScore ++;
		}
		return playerScore;
	}
	
	
	public void senseNearby() {
//		 if else player location?
//		System.out.println("The is a vile smell on the air");
//		System.out.println("You sense a faint glitter");
//		System.out.println("You sense a breeze");
//		i = (i + 1) % n
//		i = (i - 1) % n
	}

//	System.out.println("The Wumpus ate you!");	
//	System.out.println("You found a piece of gold!");
//	System.out.println("You fell in a pit and died!");	

}
