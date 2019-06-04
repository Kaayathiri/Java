class bank{
	private int amount;
	public void deposit (int money){
		amount += money;
	}
	public void withdraw (int money){
		if (money < amount ){
			amount -= money;
		}
		else{
			
			System.out.println("Insufficient funds");
		}
	}

	public void balance (){
		
			System.out.println("Your balance is: "+ amount);
	}
	
	public bank(){
		System.out.println("Hello, my friends.");
	}
}


class NBS {
	public static void main (String xyz[]){
		bank ref;
		ref=new bank();
		ref.deposit(1000);
		ref.withdraw(5000);
		ref.balance();
	}
}

