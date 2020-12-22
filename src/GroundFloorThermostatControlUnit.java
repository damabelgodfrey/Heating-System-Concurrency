
public class GroundFloorThermostatControlUnit extends Thread {
	private int [] temperatures= {20, 21, 22, 23};
	private final Temperature_Controller temperatureController;

	public GroundFloorThermostatControlUnit(Temperature_Controller temperature_controller)
	{
		super("GroundFloorThermostatControlUnit");
		this.temperatureController = temperature_controller;
	}
	
	public void run()
	{
		
			
	}

}
