
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
			for (int i = 0; i <temperature.length; i++)
			{
				System.out.println(this.getName() + " is setting temperature of  " + temperature[i]);
				try
				{
					temperatureController.setATtemp(temperature[i]);
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
