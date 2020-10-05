package com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.view;

import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Door;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Maze;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Room;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Wall;

/**
 * @author valdir-sistemas
 *
 */
public abstract class AbstractMazeFactory {

	public abstract Maze makeMaze();

	public abstract Wall makeWall();

	public abstract Room makeRoom();

	public abstract Door makeDoor();
}
