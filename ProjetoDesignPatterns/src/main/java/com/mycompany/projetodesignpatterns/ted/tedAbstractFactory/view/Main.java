package com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.view;

import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.MazeGame;

/**
 *
 * @author valdir-sistemas
 */
public class Main {
	private static MazeGame montarJogo(String tipo) {
		AbstractMazeFactory amzf = null;
		if (tipo.equals("Maze"))
			amzf = new MazeFactory();
		else if (tipo.equals("MazeEnchanted"))
			amzf = new MazeEnchantedFactory();

		MazeGame mzg = new MazeGame();
		mzg.setMaze(amzf.makeMaze());
		mzg.setWall(amzf.makeWall());
		mzg.setRoom(amzf.makeRoom());
		mzg.setDoor(amzf.makeDoor());

		return mzg;
	}

	public static void main(String[] args) {
		MazeGame mz1 = montarJogo("Maze");
		MazeGame mz2 = montarJogo("MazeEnchanted");

		System.out.println("\n" + mz1);
		System.out.println("\n" + mz2);
	}
}
