package test.auto;

import java.beans.VetoableChangeListener;

public class Car{
	
	private Engine engine;
	
	public Car(Engine engine) {
		this.engine=engine;
	}
	
	public void drive() {
		if(engine == null) {
			System.out.println("engine�� ��� �޸� �� �����.");
		} else {
			System.out.println("�޷���.");
		}
	}
}
