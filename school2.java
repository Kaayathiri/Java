class results2{
	private int phy,chem,maths;
	public void physics (int P){
		if (P>=0 && P<=150){
			phy=P;
		}
	else {
		System.out.println("Invalid entry");
	}
}
	public void chemistry (int C){
		if (C>=0 && C<=150){
			chem=C;
		}
		else {
			System.out.println("Invalid entry");
		}
	}
	public void maths (int M){
		if (M>=0 && M>=0){
			maths=M;
		}
		else{
			System.out.println("Invalid entry");
		}
		}
	public void showresults2(){
		int total=phy+maths+chem;
			if (total>=150){
				System.out.println("You have passed! ");
			}
			else {
				System.out.println("You have failed :(");
			}
		System.out.println("The total marks: " + total);
	}
	}
class school2{
	public static void main(String xyz[]){
		results2 Peter;
		Peter=new results2();
		Peter.physics(120);
		Peter.chemistry(100);
		Peter.maths(200);
		Peter.showresults2();
	}
}






	

