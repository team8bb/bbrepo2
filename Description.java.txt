
public class Description {

	String height;
	String weight;
	String wingSpan;
	Color mainColor;
	
	Description()
	{
		height = null;
		weight = null;
		wingSpan = null;
		mainColor = null;
	}
	
	Description(Description inputDescription)
	{
		setHeight(inputDescription.getHeight());
		setWeight(inputDescription.getWeight());
		setWingSpan(inputDescription.getWingSpan());
		mainColor.setColor(inputDescription.getColor());
	}
	
	void setHeight(String input)
	{
		height = input;
	}
	void setWeight(String input)
	{
		height = input;
	}
	void setWingSpan(String input)
	{
		height = input;
	}
	void setColor(String input)
	{
		mainColor.setColor(input);
	}
	
	String getHeight()
	{
		return height;
	}
	
	String getWeight()
	{
		return weight;
	}
	
	String getWingSpan()
	{
		return wingSpan;
	}
	
	String getColor()
	{
		return mainColor.getColor();
	}
	
	public String toString()
	{
		return ("HEIGHT: " + height + "\nWEIGHT: " + weight + 
				"\nWINGSPAN" + wingSpan + "\nCOLOR" + mainColor.getColor()); // FORMAT: HEIGHT: <height>, \n 
	}
}
