// Georgia Tech Intro to OOP java class, Homework#3 console battleship program...........................By rsc
//
//
import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {
		System.out.println("  W e l c o m e    t o    B a t t l e s h i p.       rsc");

		char p1board[][] = {{'-','-','-','-','-'},//         player 1 board to save positions of ships
					{'-','-','-','-','-'},
					{'-','-','-','-','-'},
					{'-','-','-','-','-'},
					{'-','-','-','-','-'}};

		char p2board[][] = {{'-','-','-','-','-'}, //         player 2 board to save positions of ships
					{'-','-','-','-','-'},
					{'-','-','-','-','-'},
					{'-','-','-','-','-'},
					{'-','-','-','-','-'}};

		char p1hist[][] = {{'-','-','-','-','-'},//         player 1 board to save hits/misses on ships
					{'-','-','-','-','-'},
					{'-','-','-','-','-'},
					{'-','-','-','-','-'},
					{'-','-','-','-','-'}};

		char p2hist[][] = {{'-','-','-','-','-'},//         player 2 board to save hits/misses on ships
					{'-','-','-','-','-'},
					{'-','-','-','-','-'},
					{'-','-','-','-','-'},
					{'-','-','-','-','-'}};
		int p1hits = 0;
		int p2hits =0;
		boolean gameover = false;
		int curplayer =1;
		Scanner input = new Scanner(System.in);

			// Setup player 1 side.

		
		for(int ship = 1;ship<6;ship++){
			boolean validin = false;
			while(!validin){
				System.out.print(" Player 1 enter row column placement for ship#"+ship+"  ");
				int row = input.nextInt();
				int col = input.nextInt();
				if(!inBounds(row,col)) System.out.println("Invalid row/col. 0-4 allowed range");
				else {
					if(shipHere(p1board, row, col)) System.out.println("Already have a ship there!!");
					else {
						validin = true; // clear space save ship
						p1board[row][col] = '@';
						printBattleShip(p1board);
						}
				}
			}
		}
		clrCon();
		//Setup player 2 board.
		for(int ship = 1;ship<6;ship++){
			boolean validin = false;
			while(!validin){
				System.out.print(" Player 2 enter row column placement for ship#"+ship+"  ");
				int row = input.nextInt();
				int col = input.nextInt();
				if(!inBounds(row,col)) System.out.println("Invalid row/col. 0-4 allowed range");
				else {
					if(shipHere(p2board, row, col)) System.out.println("Already have a ship there!!");
					else {
						validin = true; // clear space save ship
						p2board[row][col] = '@';
						printBattleShip(p2board);
						}
				}
			}
		}
		clrCon();
		while(!gameover){
			switch(curplayer){

				case 1: //            PLAYER 1 
					boolean hit = false;
					boolean prevmiss = false;
					int row=0, col=0;
					//clrCon();
					printBattleShip(p2hist);
					do {
						System.out.print(" Player1 enter row column for shot: ");
						row = input.nextInt();
						col = input.nextInt();
						if((p2hist[row][col] == 'O') || (p2hist[row][col] == 'X')){
							System.out.println(" Thats a previous shot !!");
							prevmiss = true;
						} else prevmiss=false;
					} while(!inBounds(row,col) || prevmiss);
					if(p2board[row][col] == '@') {//           check board spot for ship
						p1hits+=1;
						p2hist[row][col] = 'X';
						System.out.println(" Good Shot !!, Ship sunk for a total of "+p1hits+" ships");
						if(p1hits==5) {
							gameover=true;
							System.out.println(" Game over , Player 1 wins..");
						}
					} else {
						p2hist[row][col] = 'O';
						System.out.println(" You MISSED!!!");
					}
					curplayer = 2;
					break;

				
				case 2://               PLAYER 2
					hit = false;
					prevmiss = false;
					//clrCon();
					printBattleShip(p1hist);
					do {
						System.out.print(" Player2 enter row column for shot: ");
						row = input.nextInt();
						col = input.nextInt();
						if((p1hist[row][col] == 'O') || (p1hist[row][col] == 'X')){
							System.out.println(" Thats a previous shot !!");
							prevmiss = true;
						} else prevmiss=false;
					} while(!inBounds(row,col) || prevmiss);
					if(p1board[row][col] == '@') { //       HIT
						p2hits+=1;
						p1hist[row][col] = 'X';
						System.out.println(" Good Shot !!, Ship sunk for a total of "+p2hits+" ships");
						if(p2hits==5) {
							gameover=true;
							System.out.println(" Game over , Player 2 wins..");
						}
					} else {
						p1hist[row][col] = 'O';  //   MISS
						System.out.println(" You MISSED!!!");
					}
					curplayer = 1;
					break;
				default:
					break;
			}// end switch

		}// while not game over
		
	}//    END MAIN
	
	// Check if in 5x5....0-4 for each
	private static boolean inBounds(int row, int col){
		if((row<0 || row>4) || (col<0 || col>4)) {
			return false;
		} else return true;
	}
	// Check if ship at row, col.. true if there
	private static boolean shipHere(char[][] board, int row, int col){
		if(board[row][col] == '@') return true;
		else return false;
	}
	// Clear screen using print lines
	private static void clrCon(){
		for(int lp=1;lp<100;lp++) System.out.println("");
	}

	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}