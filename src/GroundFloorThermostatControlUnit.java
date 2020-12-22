
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
		
			for (int i = 0; i < temperatures.length; i++)
			{
				System.out.println(this.getName() + " is setting temperature of  " + temperatures[i]);
				try
				{
					temperatureController.setGFtemp(temperatures[i]);
					XUtils.sleepForRandomTime(this.getName());
				} catch (InterruptedException e)
				{
					System.out.println("Error Alert" + e.toString());
				} catch(Exception e) {
					System.out.println("Error Alert" + e.toString());
				}
			}
	}

}
