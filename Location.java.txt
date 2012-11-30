
public class Location {

	String county;
	String city;
	
	Location()
	{
		county = null;
		city = null;
	}
	
	Location(String inputCounty)
	{
		county = inputCounty;
	}
	
	Location(String inputCounty, String inputCity)
	{
		setCounty(inputCounty);
		setCity(inputCity);
	}
	
	Location(Location inputLoc)
	{
		county = inputLoc.getCounty();
		city = inputLoc.getCity();
	}
	
	void setCounty(String input)
	{
		county = input;
	}
	
	void setCity(String input)
	{
		city = input;
	}
	
	String getCounty()
	{
		return county;
	}
	
	String getCity()
	{
		return city;
	}
	
	public String toString()
	{
		return (county + " county, " + city + " city."); // SNOHOMISH county, and anada city waa SEATTLE
	}
	
}
