class operation{
	public static void main(String data[]){
			int first, second, result;
			first=second=result=0;
		try{
			first=Integer.parseInt(data[0]);
			second=Integer.parseInt(data[1]);
			result=first/second;
			System.out.println("The result is "+ result);
		}	
		catch(NumberFormatException exp){
			System.out.println("Digits only please");
		}
		catch(ArrayIndexOutOfBoundsException exp2){
			System.out.println("Not enough values");
		}
		
		catch(ArithmeticException exp2){
			System.out.println("Not divisible by 0");
		}
	System.out.println("Byeee hun");
	}
}