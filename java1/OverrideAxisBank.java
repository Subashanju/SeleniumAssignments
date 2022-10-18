package assignment.week3.java1;



public class OverrideAxisBank extends OverrideBankInfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverrideAxisBank obj = new OverrideAxisBank();
		obj.deposit();

	}
	public void deposit() {
		System.out.println("Deposit amount ");
		super.deposit();
		
	}

	
}
