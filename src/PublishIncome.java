
public class PublishIncome extends Income {
	public PublishIncome(double income) {
		super(income);
	};
	@Override
	public double getTax() {
		return income*0.3;
	}
	

}
