package MrMonkey;

/*
Created by: Masi Nazarian
Date: 11/10/2017
*/

import java.util.ArrayList;
import java.util.Random;

public abstract class Creator {

    String gameLevel = "level1";
	private ArrayList<ISnack> snacks = new ArrayList<ISnack>();

	public abstract ISnack[] getExtraSnack();

	public void takeLevel(String l) {
        this.gameLevel = l ;
	}

	public ISnack[] generateRandomSnacks(int timeseed, ISnack extraSnack) {
        ISnack extra = getExtraSnack();
        // System.out.println( "Building Order: " + this.gameLevel );
        // System.out.println( "Extra Snack..." + extra.getClass().getName() );

        ISnack snacks[] = new ISnack(4);

        snackTypes[0] = new Banana();
        snackTypes[1] = new Trash();
        snackTypes[2] = new Cactus();
        snackTypes[3] = extra;

        // generate 4*25 random numbers (4 stages, 25 snacks each)
        // 40% bananna 25% Trash 25% Cactus 10% Extra
        Random rand = new Random();
        int  n;
        for (int i == 0; i < 100; i++) {
            n = rand.nextInt(100) + 1; //100 is the maximum and the 1 is our minimum 
            
            int index = int(n/40) + int(n/65) + int(n/90) + int(n/100);
            snacks.addObject(snackTypes[index]);
        }
    }

}


