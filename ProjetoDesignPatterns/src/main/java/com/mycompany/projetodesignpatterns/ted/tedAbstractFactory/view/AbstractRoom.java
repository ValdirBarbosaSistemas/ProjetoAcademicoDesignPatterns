package com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.view;

import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.Room;
import com.mycompany.projetodesignpatterns.ted.tedAbstractFactory.model.RoomEnchanted;

/**
 * 
 * @author valdir-sistemas
 *
 */

public abstract class AbstractRoom {

	public abstract Room room();

	public abstract RoomEnchanted roomEnchanted();
}
