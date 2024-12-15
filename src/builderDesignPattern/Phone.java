package builderDesignPattern;

public class Phone {
	private String modelName;
	private int ram;
	private double screenSize;
	private String processesorName;
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public double getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	public String getProcessesorName() {
		return processesorName;
	}
	public void setProcessesorName(String processesorName) {
		this.processesorName = processesorName;
	}
	@Override
	public String toString() {
		return "Phone [modelName=" + modelName + ", ram=" + ram + ", screenSize=" + screenSize + ", processesorName="
				+ processesorName + "]";
	}
	public Phone(String modelName, int ram, double screenSize, String processesorName) {
		super();
		this.modelName = modelName;
		this.ram = ram;
		this.screenSize = screenSize;
		this.processesorName = processesorName;
	}

}
