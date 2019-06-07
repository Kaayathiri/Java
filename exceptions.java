class exceptions{


public static void main(String xyz[]){
	int A,B,C;
	 A=B=C=0;
	try{
		A=4;
		B=0;
		C=A/B;
		System.out.println("Result is "+ C);
	}
	catch(NumberFormatException exp1){
		System.out.println("This cannot happen.");
	}
	catch(ArithmeticException exp2){
		System.out.println("ERROR ERROR, cannot be divisible by 0");
	}
}
}