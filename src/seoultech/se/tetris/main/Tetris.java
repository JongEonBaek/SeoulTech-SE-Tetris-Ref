package seoultech.se.tetris.main;

import seoultech.se.tetris.component.Board;

public class Tetris {

	public static void main(String[] args) {
		Board main = new Board();
		main.setSize(450, 610);
		main.setVisible(true);
	}
}

