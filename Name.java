/**
 * Package: Bothell Birder
 * @author Team8
 * CSS 360
 */
public class Name {
private String commonName;
private String scientificName;
   
    
/**
* This is the default constuctor
* @return no value
*/
public Name(){
     this(null, null);
}
/**
* This is the second constructor
* @param cName : value for common name
* @param sName : value for scientific name
*/
public Name(String cName, String sName){
     commonName = cName;
scientificName = sName;   
}

public Name(Name inputName)
{
	commonName = inputName.getCommonName();
	scientificName = inputName.getScientificName();
}

/**
* This method returns the value for common name
* @return the value for common name
*/
public String getCommonName(){
     return commonName;
}
/**
* This method sets a new value for the common name
* @param aName a new name value for common name
* @return no value is returned
*/
public void setCommonName(String aName){
     commonName = aName;
}    
/**
* This method returns the value for Scientific name
* @return the value for Scientific name
*/
public String getScientificName(){
     return scientificName;
}
/**
* This method sets a new value for the Scientific name
* @param aName a new name value for Scientific name
* @return no value is returned
*/
public void setScientificName(String aName){
     scientificName = aName;
}
@Override
public String toString(){
   return "Common Name: " + commonName + "; "
           + "Scientific Name: " + scientificName;
}
    
}
