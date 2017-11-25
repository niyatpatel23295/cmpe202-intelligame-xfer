 

/*
Created by: Masi Nazarian
Date: 11/10/2017
*/

public class BasicModeFactory extends Creator {

	public ISnack getExtraSnack() {
        return new PowerUp() ;
	}

}
