class maths2 extends maths{
	public void multiplication(int a,int b){
		int result=a*b;
		System.out.println("The result is "+ result);
	}
	public void subtraction (int a, int b){
		int result=a-b;
		System.out.println("The result is "+ result);
	}

}
class test4{
	public static void main(String xyz[]){
		maths2 x=new maths2();
		x.add(10,20);
		x.subtraction(20,10);
		x.multiplication(10,20);
	}
}
