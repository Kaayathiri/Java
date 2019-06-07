class reverse{
	public void reverseprintword(String msg){
		String word="";
		int i;
		int j;
		for (i=0;i<msg.length();i++){
			if (msg.substring(i,i+1).equals(" ")){
				

					System.out.println(word);
word="";
		}
		else {
			word=msg.substring(i,i+1)+word;
		}
	}
System.out.println(word);
}
}


class reverseprint{
	public static void main(String xyz[]){
		reverse u=new reverse();
		u.reverseprintword("Hello my friends");
	}
}