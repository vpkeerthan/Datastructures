package TryingTicTacToe;

import java.util.Scanner;

public class TicTacToe {
	public int matrix[][] = new int[3][3];
	public boolean gameOver=false;
	
	public void initializeMatrix(){
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				matrix[i][j]=0;
			}
		}
	}
	
	public void printMatrix(){
		System.out.println("Printing the matrix\n");
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				System.out.println(" "+matrix[i][j]);
			}
			System.out.println("\n");
		}
	}
	
	public void verifyTheInput(int user,int x,int y){
		if(matrix[x][y]!=0){
			System.out.println("Incorrect input");
		}else{
			matrix[x][y] = user;
			if(checkTicTacToe(user,x,y)!=0){
				System.out.println("User "+user+" is the winner");
				gameOver = true;
			}
		}
	}
	
	public int checkTicTacToe(int user,int x,int y){
		if((matrix[0][0]==user && matrix[0][1]==user && matrix[0][2]==user)
				|| (matrix[1][0]==user && matrix[1][1]==user && matrix[1][2]==user)
				|| (matrix[2][0]==user && matrix[2][1]==user && matrix[2][2]==user)
				|| (matrix[0][0]==user && matrix[1][0]==user && matrix[2][0]==user)
				|| (matrix[0][1]==user && matrix[1][1]==user && matrix[2][1]==user)
				|| (matrix[0][2]==user && matrix[1][2]==user && matrix[2][2]==user)
				|| (matrix[0][0]==user && matrix[1][1]==user && matrix[2][2]==user)
				|| (matrix[0][2]==user && matrix[1][1]==user && matrix[2][0]==user)
				){
			return user;
		}else{
			return 0;
		}
	}
	
	public static void main(String args[]){
		TicTacToe t = new TicTacToe();
		t.initializeMatrix();
		t.printMatrix();
		
		for(int i=0;i<9;i++){
			Scanner sc = new Scanner(System.in);
			int user = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println("\n");
			t.verifyTheInput(user,x,y);
			if(t.gameOver){
				break;
			}
		}
		if(!t.gameOver){
			System.out.println("Game Over!! It's a Draw!!");
		}
		
	}
}

// 1) Handle user input, same user cannot play continuously
// 2) Handle checkTicTacToe with row and column and diagonal
// 3) 0(1) Implementation
// 4) No need to check all the rows and columns each time, improve the efficiency by checking the necessary row columns based on the input
/*
 * 
 * bool XWon(int r, int c){ // Call this function when player moves
     int boardSize = board[0].Length;
     row[r]++;
     column[c]++;
     if(r==c) diag[r]++;
     if(r+c==boardSize) antiDiag[r]++;
     if(row[r]==boardSize || column[c]==boardSize || diag[r]==boardSize || antiDiag[r]==boardSize) return true;
     else return false;
}

eg : row[2] = 4 means third row has 4 X placed.
col[0] = 2 means first column has 2 X placed.
diagCount = 3 means there is 3 X placed in diagonal (the line from top left to bottom right)
inverseDiagCount = 1 means there is 1 X placed in inverse diagonal (the line from top right to bottom left)
*/
