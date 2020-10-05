package com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.view;

import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Door;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.DoorEnchanted;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Maze;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.MazeEnchanted;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Room;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.RoomEnchanted;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Wall;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.WallEnchanted;

public class MazeEnchantedFactory extends AbstractMazeFactory {

	@Override
	public Maze makeMaze() {
		return new MazeEnchanted();
	}

	@Override
	public Wall makeWall() {
		return new WallEnchanted();
	}

	@Override
	public Room makeRoom() {
		return new RoomEnchanted();
	}

	@Override
	public Door makeDoor() {
		return new DoorEnchanted();
	}
}
