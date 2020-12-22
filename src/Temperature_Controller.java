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
		
		int gTrialAttempt = 0;	
		while (!temperature_check())
		{	
			try
			{		
				wait(500);
				
			} catch (InterruptedException e)
			{
				System.out.println(e.toString());
			}
			++gTrialAttempt;
			if(gTrialAttempt >= maxTrial) {
				break;
			}
		}
		if(temperature_check()) {
		groundfloor_temp = newgftemp;
		System.out.println("Ground Floor Temp successfully set to: " + newgftemp);
		}
		notifyAll();	
	}

	@Override
	public synchronized void setFFtemp(int newfftemp) {
		int fTrialAttempt =1;
		while (!temperature_check())
		{
			try
			{		
				wait(500);
				
			} catch (InterruptedException e)
			{
				System.out.println(e.toString());
			}
			++fTrialAttempt;
			if(fTrialAttempt>= maxTrial) {
				break;
			}
		}
		if(temperature_check()) {
		firstfloor_temp = newfftemp;
		System.out.println("First Floor Temp successfully set to: " + newfftemp);
		}
		notifyAll();	
	}

	@Override
	public synchronized void setATtemp(int newattemp) {
		int aTrialAttempt =1;
		while (!temperature_check())
		{
			try
			{		
				wait(500);
				
			} catch (InterruptedException e)
			{
				System.out.println(e.toString());
			}
			++aTrialAttempt;
			if(aTrialAttempt>= maxTrial) {
				break;
			}
		}
		if(temperature_check()) {
			this.attic_temp = newattemp;
			System.out.println("Attic Floor Temp Successfully set to: " + newattemp);
		}	
		notifyAll();
	}

	@Override
	public synchronized void displayTemperatures() {	
		System.out.println ("");
		System.out.println("The Final Temperature for Ground floor is :" + groundfloor_temp );
		System.out.println("The Final Temperature for First Floor is :" + firstfloor_temp );
		System.out.println("The Final Temperature for Attic floor is :" + attic_temp );
	}

	public synchronized boolean temperature_check() {
		
		return(groundfloor_temp < firstfloor_temp)  &&  (groundfloor_temp <= attic_temp);
		
	}
} // Temperature_Controller
