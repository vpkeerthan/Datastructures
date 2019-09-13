package SudokoisValid;

import java.util.HashSet;

public class Sudoko implements SudokoInterface{
	int matrix[][] = {
			{1,2,3,4,5,6,7,8,9},
			{4,5,6,7,8,9,1,2,3},
			{7,8,9,1,2,3,4,5,6},
			{2,3,4,5,6,7,8,9,1},
			{5,6,7,8,9,1,2,3,4},
			{8,9,1,2,3,4,5,6,7},
			{9,1,2,3,4,5,6,7,8},
			{3,4,5,6,7,8,9,1,2},
			{6,7,8,9,1,2,3,4,5},
			};
	
//	public void initialize(){
//		int matrix[][] = {
//				{1,2,3,4,5,6,7,8,9},
//				{4,5,6,7,8,9,1,2,3},
//				{7,8,9,1,2,3,4,5,6},
//				{2,3,4,5,6,7,8,9,1},
//				{5,6,7,8,9,1,2,3,4},
//				{8,9,1,2,3,4,5,6,7},
//				{9,1,2,3,4,5,6,7,8},
//				{3,4,5,6,7,8,9,1,2},
//				{6,7,8,9,1,2,3,4,5},
//				};
//		
//	}
	
	public boolean checkRow(){
		for(int row=0;row<9;row++){
			HashSet<Integer> hset = new HashSet<Integer>();
			for(int col=0;col<9;col++){
				if(!hset.add(matrix[row][col])){		//hset returns false when you enter duplicate values
					return true;		//returning as duplicate entries are created
				}
			}
		}
		return false;
	}
	
	public boolean checkColumn(){
		for(int col=0;col<9;col++){
			HashSet<Integer> hset = new HashSet<Integer>();
			for(int row=0;row<9;row++){
				if(!hset.add(matrix[row][col])){
					return true;		//returning as duplicate entries are created
				}
			}
		}
		return false;
	}
	
	public boolean checkBox(){
		for(int block=0;block<9;block++){		// for 9 boxes
			HashSet<Integer> hset = new HashSet<Integer>();
			for(int i = block/3*3; i < block/3*3 + 3;i++){
				for(int j = block%3*3; j < block%3*3 + 3;j++){
					if(!hset.add(matrix[i][j])){
						return true;		//returning as duplicate entries are created
					}
				}
			}
		}
		return false;
	}
}
