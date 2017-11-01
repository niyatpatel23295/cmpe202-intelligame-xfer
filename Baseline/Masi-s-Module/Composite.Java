package composite;

import java.util.ArrayList;

public class Composite implements IDisplayComponent {
	
    private ArrayList<IDisplayComponent> components = new ArrayList<IDisplayComponent>();
    private String description;
	
    public Composite(String d)
    {
        description = d;
    }
	
    public void addSubComponent( IDisplayComponent c ) {
	components.add(c);
    }
	
    public void removeSubComponent( IDisplayComponent c ) {
	components.remove(c);
    }
	    
    public IDisplayComponent getSubComponent(int i) {
	return components.get( i );
    }

    @Override
    public void display() {
	 System.out.println( description );
	 for (Component obj  : components)
	 {
             obj.display();
	 }
    }
 
}
 
