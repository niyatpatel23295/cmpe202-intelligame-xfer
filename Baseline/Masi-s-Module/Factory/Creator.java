package MrMonkey;

import java.util.ArrayList;

public abstract class Creator {

    String gameLevel = "level1";
	private ArrayList<ISnack> snacks = new ArrayList<ISnack>();

	public abstract ISnack[] CreateSnack(int timeseed, ISnack extraSnack);

	public void takeLevel(String l) {
        this.gameLevel = l ;
	}

	public ISnack[] generateRandomSnacks(int timeseed, ISnack extraSnack) {
        ISnack extra = getExtraSnack() ;
        System.out.println( "Building Order: " + this.gameLevel );
        System.out.println( "Pull Engine..." + eng.getClass().getName() );
        System.out.println( "Assemble Car..." );
        System.out.println( "Paint...");
        System.out.println( "Ship...");

        snacks.addObject(new Banana());
        snacks.addObject(new Trash());
        snacks.addObject(new Cactus());
        snacks.addObject(extra);

        // generate 100 random numbers
  		// if/else statement: if divisible by ... then banana, and so on
        // 40% bananna 25% Trash 25% Cactus 10% Extra
        // rand(timeseed);

  //       for (int i = 0; i < qtd; i++) {
	 //      x += 60;
	 //      addObject(snacks[i], x, y);
		// }
	}

}


