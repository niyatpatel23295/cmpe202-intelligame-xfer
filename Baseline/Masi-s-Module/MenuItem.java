package composite;

import java.text.DecimalFormat;


public class MenuItem implements IDisplayComponent {

    private String description ;
    private Double price ;

    public MenuItem (String d, Double p)
    {
        description = d ;
        price = p ;
    }
    
    public void display() {
	 System.out.println( description );
    }

    public void addChild(Component c) {
	// no implementation
    }

    public void removeChild(Component c) {
        // no implementation
    }

    public IDisplayComponent getChild(int i) {
        // no implementation
    }
	
    public void addSubComponent( IDisplayComponent c ) {
	// no implementation
    }
	
    public void removeSubComponent( IDisplayComponent c ) {
	// no implementation
    }
	    
    public IDisplayComponent getSubComponent(int i) {
	// no implementation
    }
	 
}
 
