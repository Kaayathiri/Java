class results {
	int phy, chem, maths;
	public void showresults(){
		int total;
		total=phy+chem+maths;
		System.out.println("The total score is "+total);
		if (total>=250){
			System.out.println("Passed!");
		}
		else {
			System.out.println("Failed:(");
		}
	}
}

class school{
	public static void main (String xyz[]){
		results john,peter;
		john=new results();
		peter= new results();
		peter.maths=100;
		peter.phy=120;
		peter.chem=140;
		john.maths=40;
		john.phy=20;
		john.chem=50;

		peter.showresults();
		john.showresults();


	}
}