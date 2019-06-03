class results {
	public static void main (String xyz[]){
		int phy, chem, maths, total;
		float per;
		phy=50; chem=150; maths=200;
		total=phy+chem+maths;
		per=total*100/450;
		System.out.println("The total marks is "+total);
		System.out.println("Your percentage: "+ per);
		if (per>=60){
			System.out.println("You have passed!");
		}
		else {
			System.out.println("You have failed!");
		}
}
	}