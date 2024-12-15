package builderDesignPattern;

public class PhoneBuilder {
	
	private String modelName;
	private int ram;
	private double screenSize;
	private String processesorName;
	
	public PhoneBuilder setModelName(String modelName) {
		this.modelName = modelName;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setProcessesorName(String processesorName) {
		this.processesorName = processesorName;
		return this;
	}
	
	
	public Phone getPhone() {
		Phone obj1 = new Phone(modelName,ram,screenSize,processesorName);
		return obj1;
		
	}
	
}
