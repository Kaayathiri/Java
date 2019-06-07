class maths46{
	int A;
	public void message(){
		int A;
		A=20;
		this.A=15;
		System.out.println("Result:" + A);
	}
	public void message2(){
		System.out.println("Data:"+A);
	}
}

class test7{
	public static void main(String xyz[]){
		maths46 x=new maths46();
		maths46 y=new maths46();
		x.message();
		x.A=25;

		x.message2();
	}
}