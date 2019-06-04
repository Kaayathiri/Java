class accounts {
	public void tax(){
		
		System.out.println("Tax Rate is " + 22.7);
	}
	public void tax (int Salary){
		float T;
		T=Salary * 22.7F/100;
		System.out.println("Your Tax is " + T);
	}
	public void tax(int Salary, double Tax_rate){
		double T;
		T=Salary * Tax_rate/100;
		System.out.println("Your Tax is "+ T);

	}
}
class accountstest{
	public static void main(String xyz[]){
		accounts income=new accounts();
		income.tax();
		income.tax(1250);
		income.tax(1250,22.7);
	}
}