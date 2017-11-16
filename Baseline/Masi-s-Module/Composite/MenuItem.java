package MrMonkey;

import java.text.DecimalFormat;


public class Menu implements IDisplayMenu {


    private String description;
    private World world;

    public MenuItem (String d)
    {
        description = d ;
    }
    
    public void display() {
	   System.out.println( description );
    }
	 
}
 
