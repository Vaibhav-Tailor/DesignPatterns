package adaptorDesignPattern;

public class IPhoneAdaptor implements IPhoneCharger{

	OnePlusCharger op;
	
	public IPhoneAdaptor(OnePlusCharger op) {
		super();
		this.op = op;
	}

	@Override
	public void charge() {
		op.DashCharger();
	}

}
