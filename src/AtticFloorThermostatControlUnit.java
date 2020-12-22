
public class AtticFloorThermostatControlUnit extends Thread{
	private int [] temperature= {18, 20, 17, 23};
	private final Temperature_Controller temperatureController;

	public AtticFloorThermostatControlUnit(Temperature_Controller temperature_controller)
	{
		super("AtticFloorThermostatControlUnit");
		this.temperatureController = temperature_controller;
	}
	
	public void run()
	{
			
	}

}
