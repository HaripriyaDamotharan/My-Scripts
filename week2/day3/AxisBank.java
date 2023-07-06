package week2.day3;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Deposit details from AxisBank");
	}

	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}
}
