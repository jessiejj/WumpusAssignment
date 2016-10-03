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
	// play x and y coords
	public int playerPosiX;
	public int playerPositY;
	// wumpus x and y coords
//	public int wX;				
//	public int wY;		
	// pit 1, 2, 3 x and y coords
	public int px1;
	public int py1;
	public int px2;
	public int py2;
	public int px3;
	public int py3;
	// gold 1, 2, and 3 x and y coords
	public int gx1;
	public int gy1;
	public int gx2;
	public int gy2;
	public int gx3;
	public int gy3;
	// wondering if you can use the loop to fill in the rest of the null spaces with ClearGround
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

	//instantiates game board
	//instantiates objects on the game board
	public void setBoard() {
		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length; col++) {
//				board[row][col] = new ClearGround('.');
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
