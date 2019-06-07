class second{
	public second(){
		System.out.println("1");
	}
}
class first extends second{
	public first(){
		System.out.println("2");
	}
	public first (int A){
		
		System.out.println("Manny");
	
	}
}
class one extends first{
	public one(){
		super (3);
		System.out.println("3");
	}
}
class two extends one{
	public two(){
	
		System.out.println("4");
	}
}
class extend{
	public static void main(String xyz[]){
		two x=new two();
	}
}