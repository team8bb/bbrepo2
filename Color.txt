
public class Color {

	String color;
	
	Color()
	{
		color = "Color is NULL";
	}
	
	Color(String input)
	{
		color = input;
	}
	
	Color(Color inputColor)
	{
		color = inputColor.getColor();
	}
	
	String getColor()
	{
			return color;
	}
	
	void setColor(String input)
	{
		color = input;
	}
	
	public String toString()
	{
		return (color);
	}
		
		
}

