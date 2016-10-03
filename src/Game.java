 import java.util.*;
 import java.util.Scanner;
 import java.util.Random;

public class Game { //has 2d array of GameItem called board
	
	Scanner input = new Scanner(System.in);
	int selection;					// user menu choice
	int row;
	int col;
	private GameItem[][] board = new GameItem[4][4];
	public int playerScore = 0;
	public int playerPosiX = 0;		 // x coordinates
	public int playerPositY = 0; 	// y coordinates
	public int wX = 1;
	public int wY = 1;
	 Random randomGenerator = new Random();

	
	public void runGame() {
		// setBoard
		//display the board
		//check score
		//sense nearby
		// present menu
		//process user decision
		//display board again
//		board = new GameItem[4][4];
		setBoard();
		display();
//		checkScore();
		menu();
			
	}
//	public void setBoard() {
//		board = new GameItem[4][4];
//		while (true) {
//			this.board[row][col] = new Wumpus('W', row, col);
//			int row = randomGenerator.nextInt(3) + 1;
//			int col = randomGenerator.nextInt(3) + 1;
//
//		}
	//instantiates game board
	//instantiates objects on the game board
	public void setBoard() {
		board = new GameItem[4][4];
		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length; col++) {
				board[row][col] = new Wumpus('W', row, col);
			}
		}
		// while loop
//		Random  randomGenerator  =  new  Random();
//		int row = randomGenerator.nextInt(3) + 1;
//		int col = randomGenerator.nextInt(3) + 1;
//		randomly place items not where player starts [0][0]
//		place wumpus first
//		place pits checking for wumpus
//		place gold checking for wumpus and pits
//		this.board[wX][wY] = new Wumpus('W');
	}
	
	//display the game board
	public void display() {
		for(row = 0; row < board.length; row++) {
			for(col = 0; col < board.length; col++) {
				System.out.print(board[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public void  menu() {
		// switch based on other menus i've got
		boolean menuActive = true; // menu loop
	    	while (menuActive){
	    		System.out.println("=====Wumpus==== ");
	    		System.out.println("1. Move player left");
	    		System.out.println("2. Move player right");
	    		System.out.println("3. Move player up");
	    		System.out.println("4. Move player down");
	    		System.out.println("9. Quit");
	    		selection = input.nextInt();
	    			switch(selection)
	    			{
	    			case 1:
	    				break;
	    			case 2:
	    				break;
	    			case 3:
	    				break;
	    			case 4:
	    				break;
	    			case 9:menuActive = false;
		                break;
	    			default:
	    				System.out.println("Invalid selection");	
	    		}
	    	}
	}
	
	
	public void senseNearby() {
//		 if else player location?
//		System.out.println("The is a vile smell on the air");
//		System.out.println("You sense a faint glitter");
//		System.out.println("You sense a breeze");
	}

//	System.out.println("The Wumpus ate you!");	
//	System.out.println("You found a piece of gold!");
//	System.out.println("You fell in a pit and died!");	

}
