 import java.util.*;
 import java.util.Scanner;

public class Game { //has 2d array of GameItem called board
	
	public Scanner sc = new Scanner(System.in);
	private int selection;					// user menu choice
	private static int row;
	private static int col;
	private GameItem[][] board = new GameItem[4][4];
	public int playerScore = 0;
	public int playerPosiX = 0;		 // x coordinates
	public int playerPositY = 0; 	// y coordinates
	public int wX = 1;
	public int wY = 1;
	

	
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
		board = new GameItem[4][4];
		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length; col++) {
				board[row][col] = new GameItem(row, col);
			}
		}
		// while loop
//		Random  randomGenerator  =  new  Random(); 
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
	    				Scanner sc = new Scanner(System.in);
	    				playerChoice = sc.nextInt();
	    				if (playerChoice = 1){
	    					//move left
	    				}
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
		// if else player location?
	
	}



}
