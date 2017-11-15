package MrMonkey;

/*
Created by: Masi Nazarian
Date: 11/10/2017
*/

import java.util.ArrayList;

public abstract class Creator {

    String gameLevel = "level1";
	private ArrayList<ISnack> snacks = new ArrayList<ISnack>();

	public abstract ISnack[] getExtraSnack();

	public void takeLevel(String l) {
        this.gameLevel = l ;
	}

	public ISnack[] generateRandomSnacks(int timeseed, ISnack extraSnack) {
        ISnack extra = getExtraSnack();
        System.out.println( "Building Order: " + this.gameLevel );
        System.out.println( "Extra Snack..." + extra.getClass().getName() );

        snacks.addObject(new Banana());
        snacks.addObject(new Trash());
        snacks.addObject(new Cactus());
        snacks.addObject(extra);

        // generate 4*25 random numbers
  		// if/else statement: if divisible by ... then banana, and so on
        // 40% bananna 25% Trash 25% Cactus 10% Extra
        // rand(timeseed);

	}

}


