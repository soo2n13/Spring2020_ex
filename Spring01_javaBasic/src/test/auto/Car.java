package test.auto;

import java.beans.VetoableChangeListener;

public class Car{
	
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		if(engine == null) {
			System.out.println("engine이 없어서 달릴 수 없어요.");
		} else {
			System.out.println("달려요.");
		}
	}
}
