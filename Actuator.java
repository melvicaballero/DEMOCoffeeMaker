package cfd;

public class Actuator {
	EnumActuator stateActuator;
	
	public void turnOff()
	{
		stateActuator=EnumActuator.ON;
	}
	///aņadidoParaTest
	public EnumActuator getstateActuator() {
		return stateActuator;
	}
	
}
