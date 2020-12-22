/**		
 * Central Heating system 
 * Initialise and start all the thread.
 * @author Godfrey Damabel
 *
 */

public class HeatingSystem {

	
	public static void main( String args[] )
	{
		Temperature_Controller temperature_controller = new Temperature_Controller() ;
		GroundFloorThermostatControlUnit groundthermostat = new GroundFloorThermostatControlUnit(temperature_controller) ;
		FirstFloorThermostatControlUnit firstthermostat = new FirstFloorThermostatControlUnit(temperature_controller) ;
		AtticFloorThermostatControlUnit atticthermostat = new AtticFloorThermostatControlUnit(temperature_controller) ;

		groundthermostat.start() ;
		firstthermostat.start() ;
		atticthermostat.start() ;
		try
		{
			groundthermostat.join();
			firstthermostat.join();
			atticthermostat.join();
		} catch (InterruptedException e)
		{
			System.out.println(e.toString());
		}
		//thread state
		System.out.println ("");
		System.out.println ("Thread States ");
		System.out.println ("The State of GroundFloorThermostatControlUnit Thread is " + groundthermostat.getState());
		System.out.println ("The State of FirstFloorThermostatControlUnit Thread is " + firstthermostat.getState());
		System.out.println ("The State of AtticFloorThermostatControlUnit Thread is " + atticthermostat.getState());
		
		temperature_controller.displayTemperatures();
	}


}
