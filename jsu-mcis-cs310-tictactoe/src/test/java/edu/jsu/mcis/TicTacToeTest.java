package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
	@Test
	public void testInitialBoardIsCompletelyEmpty() {
		TicTacToe board = new TicTacToe();
		int emptyCount = 0;
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				if(board.isEmptyField(row,col)){
					emptyCount++;
				}
			}
		}
		assertEquals(9, emptyCount);
	}

	@Test
	public void testWhosTurnToMark(){
		TicTacToe board = new TicTacToe();
		boolean oTurn = false;
		assertEquals(true, board.isXTurn(oTurn));
	}
	
	/*@Test
	public void testBoardMarked(int row, int col){
		TicTacToe board = new TicTacToe();
		
	}


	@Test
	public void testXWinsDiagnolly(){
		TicTacToe board = new TicTacToe();
		for(int i=0; i < 3; i++) {
			for(int j=0; j < 3; j++) {
				if(TicTacToe.Mark.isMark(i, j) && TicTacToe.Mark.isMark((i+1), (j+1)) && TicTacToe.Mark.isMark((i+2), (j+2))) {
					assertEquals(true, TicTacToe.isXWinsDiagnolly());
				}
			}
		}
	}
	@Test
	public void testXWinsVertically(){
		TicTacToe board = new TicTacToe();
		for(int i=0; i < 3; i++) {
			for(int j=0; j < 3; j++) {
				if(TicTacToe.Mark.isMark(i, j) && TicTacToe.Mark.isMark((i+1), (j)) && TicTacToe.Mark.isMark((i+2), (j))) {
					assertEquals(true, TicTacToe.isXWinsVertically());
				}
			}
		}
	}
	@Test
	public void testXWinsHorizontally(){
		TicTacToe board = new TicTacToe();
		for(int i=0; i < 3; i++) {
			for(int j=0; j < 3; j++) {
				if(TicTacToe.Mark.isMark(i, j) && TicTacToe.Mark.isMark((i), (j+1)) && TicTacToe.Mark.isMark((i), (j+2))) {
					assertEquals(true, TicTacToe.isXWinsVertically());
				}
			}
		}
	}
	@Test
	public void testForTie(){
		TicTacToe board = new TicTacToe();
		for(int i=0; i < 3; i++) {
			for(int j=0; j < 3; j++) {
				if(TicTacToe.Mark.isMark(i, j)) {
					;
				}
			}
		}
	}*/
}