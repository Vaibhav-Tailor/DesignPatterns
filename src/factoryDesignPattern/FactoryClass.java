package factoryDesignPattern;

public class FactoryClass {

	public static OS createInstance(String operatingSystem){
		if(operatingSystem.equalsIgnoreCase("Android")) return new Android(); 
		else return new Ios(); 
	}
}
