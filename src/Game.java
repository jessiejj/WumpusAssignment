 import java.util.*;
 import java.util.Scanner;
 import java.util.Random;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	public int selection;					// user menu choice
	private int row;
	private int col;
//	easier to change the size of the board
//	Could easily take an input from player for board size
	private int boardSize = 4;
	private GameItem[][] board = new GameItem[boardSize][boardSize];
	public int playerScore = 0;
//	player x and y coords
	private int playerPosiX;
	private int playerPosiY;
	public boolean gameActive = true;
	public boolean isAlive = true;
	Random randomGenerator = new Random();
//	expandable number of obstacles and rewards
//	could easily take an input from user to expand
	private int numOfPit = 3;
	private int numOfGold = 3;
	private int numOfWump = 1;
//	for moving player
	public int num;
	public boolean isX;
//	set player
	public boolean isSet = false;
	public int currentTurn = 0;
	
	public void runGame() {
		setBoard();
		setPlayer();
		while (gameActive == true && isAlive == true) {
			newTurn();
		}
		endGame();
	}
	
	public void newTurn(){
	    display();
	    menu();
		playerStatus();
		checkScore();
		}
	
	public void checkScore(){
		if (playerScore == numOfGold){
			gameActive = false;
			System.out.println("You won!");
			System.out.println("You found all the gold!");
		}
	}

//	instantiates game board
//	instantiates objects on the game board
	public void setBoard() {
//		check if the index generated is null, if yes place Wumpus
		int wumpCount = 0;
		while (wumpCount < numOfWump) {
		int wX = randomGenerator.nextInt(board.length);
		int wY = randomGenerator.nextInt(board.length);
			if (board[wX][wY]==null){
				board[wX][wY] = new Wumpus('W');
				wumpCount++;
			}
		}
		
//		check if index generated is null, if yes place Pit
//		repeat until 3 pits reached 
		int pitCount = 0;		
		while (pitCount < numOfPit){
			int pX = randomGenerator.nextInt(board.length);
			int pY = randomGenerator.nextInt(board.length);
				if (board[pX][pY]==null){
					board[pX][pY] = new Pit('P');	
					pitCount ++;
				}
		}
		int goldCount = 0;		
		while (goldCount < numOfGold){
			int gX = randomGenerator.nextInt(board.length);
			int gY = randomGenerator.nextInt(board.length);
				if (board[gX][gY]==null){
					board[gX][gY] = new Gold('G');
					goldCount ++;
				}
		}
		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length; col++) {
				if (board[row][col]==null){
					board[row][col] = new ClearGround('.');
				}
			}	
		}
	}
	
//	find a clearGround index and set player there
	void setPlayer() {
		while (isSet == false) {
			
			playerPosiX = randomGenerator.nextInt(board.length);
			playerPosiY = randomGenerator.nextInt(board.length);
			
			if (board[playerPosiX][playerPosiY].c=='.'){
				isSet = true;
			}
			else{
				isSet = false;
			}
		}
	}

//	display the game board
//	iterate through rows and cols and display GameItem at that index
	public void display() {
		for(row = 0; row < board.length; row++) {
			for(col = 0; col < board.length; col++) {
//				if else, check player and display
				if (board[playerPosiX][playerPosiY] == board[row][col]){
					System.out.print(board[playerPosiX][playerPosiY].displayPlayer() + " ");
				}
				else {
				System.out.print(board[row][col].display() + " ");
				}
			}
			System.out.println();
		}
	}

	public void  menu() {
//		menu loop
		boolean menuActive = true;
    	while (menuActive){
//    		try {
    			System.out.println("=====Wumpus===== ");
		    	System.out.println("1. Move player left");
		   		System.out.println("2. Move player right");
		   		System.out.println("3. Move player up");
		   		System.out.println("4. Move player down");
		   		System.out.println("5. Quit");
	    		System.out.println("================");
	    		selection = sc.nextInt();
		    			switch(selection)
		    			{
		    			case 1:
//		    				left
		    				move(-1, false);
		    				endTurn();
		    				break;
		    			case 2:
//		    				right
		    				move(1, false);
		    				endTurn();
		    				break;
		    			case 3:
//		    				up
		    				move(-1, true);
		    				endTurn();
		    				break;
		    			case 4:
//		    				down
		    				move(1, true);
		    				endTurn();
		    				break;
		    			case 5:menuActive = false;
		    			endGame();
			                break;
		    			default:
		    				System.out.println("Invalid selection");	
		    		}
    		}
//    		catch(Exception ex) {
//    			System.out.println("Invalid input");
//    		}
//    		selection = sc.nextInt();
    	}
	
	public void endTurn(){
		newTurn();
	}
	
//	generic move method
//	using modulus operator to wrap around the array
//	if you provide an index greater than array length it'll wrap back to 0+
//	using the if statement to catch negative index and take you to array length - 1
	public void move(int num, boolean isX) {
		if (isX == true) {
			playerPosiX = (playerPosiX + num >= 0) ? (playerPosiX + num) % board.length : board.length - 1;
		} 
		else {
			playerPosiY = (playerPosiY + num >= 0) ? (playerPosiY + num) % board.length : board.length - 1;
		}
	}
	
	public void senseNearby() {
//		 if else player location?
//		System.out.println("The is a vile smell on the air");
//		System.out.println("You sense a faint glitter");
//		System.out.println("You sense a breeze");
//		i = (i + 1) % n
//		i = (i - 1) % n
	}
	
	public void playerStatus() {
		
		if (board[playerPosiX][playerPosiY].c=='W') {
			System.out.println("The Wumpus ate you!");	
			isAlive = false;
		}
		else if (board[playerPosiX][playerPosiY].c=='P') {
			System.out.println("You fell in a pit and died!");
			isAlive = false;
		}
		else if (board[playerPosiX][playerPosiY].c=='G'){
			System.out.println("You found a piece of gold!");			
			playerScore ++;
			isAlive = true;
		}
		else{
			isAlive = true;
		}
	}
	
	public void endGame(){
		if (gameActive == false){
			System.out.println("Game over");
		}
	}
}
