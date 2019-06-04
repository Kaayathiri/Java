class results {
	int phy, chem, maths;
	public void showresults(){
		int total;
		float per;
		total=phy+chem+maths;
		per=total*100F/250;
		System.out.println("The total score is "+total);
		System.out.println("The total percentage is "+ per);
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
		peter.maths=115;
		peter.phy=126;
		peter.chem=142;
		john.maths=47;
		john.phy=23;
		john.chem=59;

		peter.showresults();
		john.showresults();


	}
}