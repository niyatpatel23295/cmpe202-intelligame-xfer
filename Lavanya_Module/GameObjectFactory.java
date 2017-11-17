
public class GameObjectFactory {
	public static final String TRASH = "trash";
	public static final String CACTUS = "cactus";
	public static final String BANANA = "banana";
	
	public GameObject getObject(String objectType){
	      if(objectType == null){
	         return null;
	      }		
	      if(objectType.equalsIgnoreCase(TRASH)){
	         return new Trash();
	         
	      } else if(objectType.equalsIgnoreCase(CACTUS)){
	         return new Cactus();
	         
	      } else if(objectType.equalsIgnoreCase(BANANA)){
	         return new Banana();
	      }
	      
	      return null;
	   }
}
