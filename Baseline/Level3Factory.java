 

/*
Created by: Masi Nazarian
Date: 11/10/2017
*/

public class Level3Factory extends Creator {

	public ISnack getExtraSnack() {
        return new PowerUp() ;
	}

}
