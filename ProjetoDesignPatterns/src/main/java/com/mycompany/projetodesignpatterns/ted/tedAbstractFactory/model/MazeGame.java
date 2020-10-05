package com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model;

public class MazeGame {
	private Maze maze;
	private Wall wall;
	private Room room;
	private Door door;

	public MazeGame() {

	}

	public Maze getMaze() {
		return this.maze;
	}

	public void setMaze(Maze maze) {
		this.maze = maze;
	}

	public Wall getWall() {
		return this.wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public Room getRoom() {
		return this.room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Door getDoor() {
		return this.door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

}
