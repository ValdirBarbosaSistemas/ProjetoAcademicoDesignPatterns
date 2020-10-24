package com.mycompany.projetodesignpatterns.singleton.view;

import com.mycompany.projetodesignpatterns.singleton.model.SingletonObject;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingletonObject object1 = SingletonObject.getInstance(); // new
		SingletonObject object2 = SingletonObject.getInstance();
		SingletonObject object3 = SingletonObject.getInstance();

		// show the message
		// object1.showMessage();

		System.out.println(object1.getEstoque());

		// object2.showMessage();
		object2.setEstoque(5);
		System.out.println(object2.getEstoque());

		System.out.println(object1.getEstoque()); // Mesmo valor que foi setado no 'object2'
		System.out.println(object3.getEstoque());
	}
}
