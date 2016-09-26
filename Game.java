 import java.util.*;
 import java.util.Scanner;

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
	

	
	public void runGame() {
		// where does set board go?
		//display the board
		//check score
		//sense nearby
		// present menu
		//process user decision
		//display board again
//		board = new GameItem[4][4];
		setBoard();
		display();
		menu();
			
	}
	
	//instantiates objects on the game board
	public void setBoard() {
		board = new GameItem[4][4];
		for (row = 0; row < board.length; row++) {
			for (col = 0; col < board.length; col++) {
				this.board[row][col] = new GameItem(row, col);
			}
		}
//		board[wX][wY] = new Wumpus('W');
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
		board = new GameItem[4][4];
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
		// if else player location?
	
	}


	
	
	
	
	
	
	// int[][] grid = new int[4][4];
	/*
	int[][] gameBoard = {
			{1,2,3,4},
			{5,6,7,8},
			{8,10,11,12},
			{13,14,15,16}};
	
	*/
	/*
	for (int i=0; i<4; i++) //row
		for (int j=0; j<4; j++) //collumn
			grid[i][j] = i=j;
	*/

}
