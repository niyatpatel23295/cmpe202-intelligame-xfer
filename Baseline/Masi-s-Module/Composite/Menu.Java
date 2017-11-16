package MrMonkey;

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author Masi Nazarian
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Menu extends World implements IDisplayMenu {
	
    private ArrayList<IDisplayMenu> menuItems = new ArrayList<IDisplayMenu>();
    private String description;
	
    public Menu(String d)
    {
        description = d;
    }
	
    public void addMenuItem( IDisplayMenu c ) {
	   menuItems.add(c);
    }
	
    public void removeMenuItem( IDisplayMenu c ) {
	   menuItems.remove(c);
    }
	    
    public IDisplayMenu getMenuItem(int i) {
	   return menuItems.get( i );
    }

    @Override
    public void display() {
        System.out.println( description );
        for (IDisplayMenu item : menuItems)
        {
            item.display();
        }
    }
 
}
 
