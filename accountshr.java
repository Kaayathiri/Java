class AbsenteesException extends Exception{}

class accountsnbs{
	public float tax(int salary, int absentees) throws AbsenteesException{
		float T;
		if (absentees>=7){
			AbsenteesException e= new AbsenteesException();
			throw e;
		}
		else{
			T=salary*21F/100;
		}
	return T;
	}
}
class accountsIT{
	public void salaryslip() throws AbsenteesException{
		accountsnbs y=new accountsnbs();
		float netsalary=2500-y.tax(2500,6);
		System.out.println(netsalary);
	}
}

class accountshr{
	public static void main(String xyz[]){
		accountsnbs x=new accountsnbs();
		try{
			float netsalary=2000-x.tax(2000,6);
		}
		catch (AbsenteesException e){
			System.out.println("Sorry too many absent days");
		}
	salaryslip();
	}

}
