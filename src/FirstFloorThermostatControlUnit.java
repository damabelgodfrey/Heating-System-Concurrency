
public class FirstFloorThermostatControlUnit extends Thread{
	private int [] temperature= {19, 23, 20, 17};
	private final Temperature_Controller temperatureController;

	public FirstFloorThermostatControlUnit(Temperature_Controller temperature_controller)
	{
		super("FirstFloorThermostatControlUnit");
		this.temperatureController= temperature_controller;
	}
	
	public void run()
	{
		
		
	}

}
