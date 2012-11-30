
public class Bird {

	int id;
	Name name;
	Gender gender;
	Location home;
	boolean inWa;
	boolean canFly;
	
	Bird()
	{
		id = -1;
		name = null;
		gender = null;
		home = null;
		inWa = false;
		canFly = false;
	}
	
	Bird(int inputID, Name iName, Gender iGender, Location iLocation, 
			boolean iInWa, boolean iCanFly)
	{
		id = inputID;
		name = new Name(iName);
		gender = new Gender(iGender);
		home = new Location(iLocation);
		inWa = iInWa;
		canFly = iCanFly; // lol
	}
	
	protected int getId()
	{
		return id;
	}
	
	boolean getCanFly()
	{
		return canFly;
	}
	
	public String toString()
	{
		return ("NAME: " +
				name.toString() + 
				
				"\nGENDER: " + 
				gender.toString()) +
				
				"\nLocation " + 
				home.toString() + 
				
				"\nIN WASHINGTON: " +
				inWa + 
				
				"\nCAN FLY: " + 
				canFly;
	}
}
