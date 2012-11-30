import java.io.File;


public class Gender {
	
	String gender; 
	Description description;
	File picture;
	
	Gender()
	{
		gender = "NO GENDER";
		description = null;
		picture = null;
	}
	
	Gender(String inputGender, Description inputDescription, File inputPicture)
	{
		gender = inputGender;
		description = inputDescription;
		picture = inputPicture;
	}
	
	Gender(Gender inputGender)
	{
		gender = inputGender.getGender();
		description = new Description(inputGender.getDescription());
		picture = new File(inputGender.getPicture())
	}
	
	void setGender(String inputGender)
	{
		gender = inputGender;
	}
	
	void setDescription(Description inputDescription)
	{
		description = new Description(inputDescription);
	}
	
	void setPicture(File inputPicture)
	{
		picture = new File(inputPicture);
	}
	
	String getGender()
	{
		return gender;
	}
	
	Description getDescription()
	{
		return description;
	}
	
	File getPicture()
	{
		return picture;
	}
	
}
