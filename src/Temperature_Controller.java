/**
 * Temperature controller Monitor class
 * @author Godfrey Damabel
 *
 */
public class Temperature_Controller implements Temperatures{

	private   int groundfloor_temp;
	private   int firstfloor_temp;
	private  int attic_temp;
	private final int maxTrial = 2;
	
	public Temperature_Controller()
	{
		this.groundfloor_temp = 18;
		this.firstfloor_temp = 20;
		this.attic_temp = 21;
	}
	@Override
	public synchronized void setGFtemp(int newgftemp) {
		
		
	}

	@Override
	public synchronized void setFFtemp(int newfftemp) {
			
	}

	@Override
	public synchronized void setATtemp(int newattemp) {
		
	}

	@Override
	public synchronized void displayTemperatures() {	
		
	}

	
} // Temperature_Controller
