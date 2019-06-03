class results2{
	private int phy,chem,maths;
	public void physics (int P){
		if (P>=0 && P<=150){
			phy=P;
		}
	else {
		phy=-1;
		System.out.println("Invalid Physics entry");
	}
}
	public void chemistry (int C){
		if (C>=0 && C<=150){
			chem=C;
		}
		else {
			chem=-1;
			System.out.println("Invalid Chemsitry entry");
		}
	}
	public void maths (int M){
		if (M>=0 && M>=0){
			maths=M;
		}
		else{
			maths=-1;
			System.out.println("Invalid Maths entry");
		}
		}
	public void showresults2(){
		int total=phy+maths+chem;
			if (phy==-1 || chem==-1|| maths==1){
				System.out.println("No results");
			}
			else {
				System.out.println("The total marks: "+ total);
			
				if (total>=150){
					System.out.println("You have passed!");
				}
				else {
					System.out.println("You have failed :(");
				
				}
			}

			
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






	

