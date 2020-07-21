

public class Main {

	public static void main(String[] args) {

		Income[] incomes = new Income[] { new Income(3000), new SalaryIncome(7500), new PublishIncome(5000),new RoyaltyIncome(12000) };
		double total = 0;
		// TODO:
		for (Income in :incomes) {
			total=total+in.getTax();
		}
		System.out.println(total);
	}

}
