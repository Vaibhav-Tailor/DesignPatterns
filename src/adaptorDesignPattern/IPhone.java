package adaptorDesignPattern;

public class IPhone {

	IPhoneCharger newCharger;
	


	public IPhone(IPhoneCharger newCharger) {
		super();
		this.newCharger = newCharger;
	}



	public void charge(){
		newCharger.charge();
	}
}
