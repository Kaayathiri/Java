class tax3 extends tax{
	public void tax (int salary){
	double result;
	result=salary*21/100;
	System.out.println("The tax is "+ result);
}

}

class tax2{
	public static void main(String xyz[]){

		tax3 x=new tax3();
		x.tax(1000);
		
	}
}