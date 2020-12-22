
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
		
			for (int i = 0; i <temperature.length; i++)
			{
				System.out.println(this.getName() + " is setting temperature of  " + temperature[i]);
				try
				{
					temperatureController.setFFtemp(temperature[i]);
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
