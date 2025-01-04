package mainMethod;

import adaptorDesignPattern.IPhone;
import adaptorDesignPattern.IPhoneAdaptor;
import adaptorDesignPattern.LightningTypeCharger;
import adaptorDesignPattern.OnePlusCharger;
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
		
		
//		Adapter Design Pattern
		LightningTypeCharger withBox= new LightningTypeCharger();//when having carger it will work fine
		
		
		OnePlusCharger opCharger=new OnePlusCharger();//Onepus charge can not directly charge the device
		IPhoneAdaptor usbCtoLightning = new IPhoneAdaptor(opCharger);//Created one adaptor C to Lightning which was implementing interface
		IPhone xr=new IPhone(usbCtoLightning);//passing that to make it work
		xr.charge();
		
//		Adapter Design Pattern		
		
		
		
//		Composit Design Pattern
		/*
		Tree like strure
		example CPU
		Leaf object and Composite object must work in place of eachother
		RAM is Leaf Object
		CPU is Composit Object
		*/
		
//		Composite Design Pattern
		
		
//		Prototype Design Pattern
		/*
		 * Deep	Cloning
		 */
//		Prototype Design Pattern
		
//		Observer Design Pattern
			/*
			 * One to Many RElation
			 * Youtube Channel to Subsriber
			 */
//		Observer Design Pattern




	}

}
