// ****************************************************************
// Labrador.java
//
// A class derived from Dog that holds information about
// a labrador retriever.  Overrides Dog speak method and includes
// information about avg weight for this breed.
//          
// ****************************************************************


public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    

    public Labrador(String name,  String color)
    {
        super(name);//needs to call parent constructor
	this.color = color;
    }

    
    public String bark()
    {
	return "Labrador barking";
    }

    public void waddle()
    {
        System.out.println(name + " is doing a waddle");
    }


}
