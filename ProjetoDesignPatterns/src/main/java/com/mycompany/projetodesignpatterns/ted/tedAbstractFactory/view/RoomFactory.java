package com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.view;

import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Room;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.RoomEnchanted;

public class RoomFactory extends AbstractRoom {

	@Override
	public Room room() {
		return new Room();
	}

	@Override
	public RoomEnchanted roomEnchanted() {
		return new RoomEnchanted();
	}

}
