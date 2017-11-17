import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.io.File;

public class LevelSingleton {

	private static LevelSingleton instance;
	private int level = 0;
	private int eligibleLevel = 0;

	
	OutputStream output = null;
	InputStream input = null;
	static File file = new File("level.properties");
	Properties prop = new Properties();
	
	
	private LevelSingleton() throws IOException {
		this.level = 1;
		String value = getProperty();
		if (value != null)
			this.eligibleLevel = Integer.parseInt(value);
	}
	
	public static LevelSingleton getInstance() throws IOException {
		if(instance == null) {
			instance = new LevelSingleton();
		}
		return instance;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int value){
		this.level = value;
	}
	public int incrementLevel() throws IOException {
		this.level = this.level + 1;
		setProperty(level);
		return level;
	}
	
	private String getProperty() throws IOException{
		String value = null;
		try {
			input = new FileInputStream(file);
			prop.load(input);
			 value = prop.getProperty("level");
			 input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return value;
	}
	
	private void setProperty(int level) throws IOException{
		try {
			output = new FileOutputStream(file);
			prop.setProperty("level", Integer.toString(level));
			prop.store(output, "Properties");
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
