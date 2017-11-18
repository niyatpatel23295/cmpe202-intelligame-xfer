import greenfoot.Actor;
import greenfoot.GreenfootSound;
import greenfoot.World;
import java.util.ArrayList;
import java.util.Random;
import greenfoot.*;

/*
Created by: Masi Nazarian
Date: 11/10/2017
*/

public abstract class Creator {

    String gameLevel = "level1";
	private ArrayList<ISnack> snacks = new ArrayList<ISnack>();

	public abstract ISnack getExtraSnack();

	public void takeLevel(String l) {
        this.gameLevel = l ;
	}

	public ArrayList<ISnack> generateRandomSnacks() {
        ISnack extra = getExtraSnack();
        // System.out.println( "Building Order: " + this.gameLevel );
        // System.out.println( "Extra Snack..." + extra.getClass().getName() );

        ArrayList<ISnack> snackTypes = new ArrayList<ISnack>();;

        snackTypes.add(new Banana());
        snackTypes.add(new Trash());
        snackTypes.add(new Cactus());
        snackTypes.add(extra);

        // generate 4*25 random numbers (4 stages, 25 snacks each)
        // 40% bananna 25% Trash 25% Cactus 10% Extra
        Random rand = new Random();
        int  n;
        final int SPS = MyWorld.getNumSnacksPerStage();
        final int STAGES = MyWorld.getNumStages();
        final int TOTAL_SNACKS = SPS * STAGES;
        for (int i = 0; i < TOTAL_SNACKS; i++) {
            n = rand.nextInt(TOTAL_SNACKS) + 1; //100 is the maximum and the 1 is our minimum 
            
            int index = (int)(n/(TOTAL_SNACKS*0.5)) + (int)(n/(TOTAL_SNACKS*0.65)) + (int)(n/(TOTAL_SNACKS*0.9)) + (int)(n/(TOTAL_SNACKS*1));
            snacks.add(snackTypes.get(index));
        }
        
        return snacks;
    }

    public ArrayList<ISnack> getBagOfSnacks() {
        ISnack extra = getExtraSnack();
        // System.out.println( "Building Order: " + this.gameLevel );
        // System.out.println( "Extra Snack..." + extra.getClass().getName() );

        ArrayList<ISnack> snackTypes = new ArrayList<ISnack>();;

        snackTypes.add(new Banana());
        snackTypes.add(new Trash());
        snackTypes.add(new Cactus());
        snackTypes.add(extra);
    }

}


