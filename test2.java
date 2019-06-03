class second{
	int phy,chem;
	public void message(){
		System.out.println("Hello");
		System.out.println("my friends");
	}
}
class test2{
	public static void main(String xyz[]){
		second x;
		x= new second();
		x.phy=75;
		x.chem=120;
		x.message();
	}
}