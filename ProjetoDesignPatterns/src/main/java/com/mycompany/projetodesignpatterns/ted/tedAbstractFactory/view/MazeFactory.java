package com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.view;

import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Door;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Maze;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Room;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Wall;

public class MazeFactory extends AbstractMazeFactory {

	@Override
	public Maze makeMaze() {
		return new Maze();
	}

	@Override
	public Wall makeWall() {
		return new Wall();
	}

	@Override
	public Room makeRoom() {
		return new Room();
	}

	@Override
	public Door makeDoor() {
		return new Door();
	}
}
