package mainMethod;

import builderDesignPattern.Phone;
import builderDesignPattern.PhoneBuilder;
import factoryDesignPattern.FactoryClass;
import factoryDesignPattern.OS;

public class DesignPatternMain {

	public static void main(String[] args) {
		
//		Factory Design Pattern STARTS
		OS custom=FactoryClass.createInstance("Android");
		custom.behaviour();
//		using other class for for creating object making low dependencies in the java file
//		Factory Design Pattern ENDS		
		
		
//		Builder Design Pattern STARTS
		try {
			Phone phone= new PhoneBuilder().setModelName("Samsung").setProcessesorName("Qualcom").getPhone();
			System.out.println(phone);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		Builder Design Pattern ENDS		
		
		
		
	}

}
