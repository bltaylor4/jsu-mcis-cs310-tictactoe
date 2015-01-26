package edu.jsu.mcis;
import java.util.*;
import java.lang.*;

public class TicTacToe {
	public enum Mark {EMPTY,X,O};
	private Mark[][] board;
	private boolean[][] emptyFields;
	public TicTacToe() {
		board = new Mark[3][3];
		emptyFields = new boolean[3][3];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = Mark.EMPTY;
				emptyFields[i][j] = true;
			}
		}
	}
	public boolean isEmptyField(int r, int c){
		return emptyFields[r][c];
	}	
	public void printBoard(){
	    System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
	}
	public boolean isXTurn(boolean xTurn){
		if(xTurn == false){
			return true;
		}
		else{
			return false;
		}
	}
/*
	public String toString(){
		String result = "";
		for
	}
	public static void main(String[] args) {
		TicTacToe b = new TicTacToe();
		
	}
	
	public boolean getMark(int row, int col) {
		return board[row][col];
	}
	
	public void Mark(int row, int col) {
		unMarked[row][col] = false;
	}
	
	public boolean isGameLost() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(!covered[i][j] && mines[i][j]) return true;
			}
		}
		return false;
	}*/
}







