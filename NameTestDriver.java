/**
 * Package: Bothell Birder
 * @author Team8
 * CSS 360
 */
public class NameTestDriver {
public static void main (String[] args){
     //test for constructors and to string method
Name name1 = new Name();
System.out.println("Name 1 : " + name1);
Name name2 = new Name("Robin", "Turdus Migratorius");
System.out.println("Name 2 : " + name2);
   
//test for get methods
System.out.println("name1:common: " + name1.getCommonName());
System.out.println("name2:common: " + name2.getCommonName());
System.out.println("name1:Scientific: " + name1.getScientificName());
System.out.println("name2:Scientific: " + name2.getScientificName());
        //test for set methods
name1.setCommonName("The American Bald Eagle");
name1.setScientificName("Haliaeetus leucocephalus");
System.out.println("Name 1 : " + name1);

//NEW CLASS TEST
//TESTING: COLOR

System.out.println("\n TESTING A NEW CLASS" +
		"			\n TESTING CLASS: COLOR");
Color color1 = new Color();
System.out.println("Making a new color called color1. Color1 is: " +color1);
color1.setColor("red");
System.out.println("Setting a new color for color1. New color is: " + color1);
Color color2 = new Color("blue");
System.out.println("Making a new color with input blue called color2. Color2 is: " + color2);
Color color3 = new Color(color2);
System.out.println("Making a new color with input as color2 called color3. Color3 is: " +color3);
System.out.println("ENDING TEST FOR COLOR CLASS");




}    
   
    
}