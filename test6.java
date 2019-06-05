class one{
	int A; 
	public void msg1(){
		System.out.println("hello");
	}
}
class two{
	int B;
	public void msg2(){
		System.out.println("Manny on the map");
	}
}
class test{
	public static void main(String xyz[]){
		one ref;
		ref=new two();
		ref.msg1();
	}
}