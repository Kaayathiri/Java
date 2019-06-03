class maths {
	public void addition (int A,int B){
		int result;
		result=A+B;
		System.out.println("Result of addition: " + result);
	}
	public int subtraction (int A,int B){
		int answer;
		answer=A-B;
		return answer;
	}
	public int multiplication (int A, int B){
		int C;
		C=A*B;
		return C;
	}
	public int division (int A, int B){
		int answer1;
		answer1=A/B;
		return answer1;
	}

}

class test3{
	public static void main (String xyz[]){
		maths x;
		x= new maths();
		x.addition(10,15);
		System.out.println("Result of subtraction: "+ x.subtraction(19,6));
		System.out.println("Result of multiplication: "+ x.multiplication(10,3));
		System.out.println("Result of division: "+ x.division(100,5));
	}
}