class bcd{
	public void backwardword(String msg){
		int i=msg.length()-1;
		String word="";
		while (i>=0){
			if (msg.substring(i,i+1).equals(" ")){
				System.out.println(word);
				word="";
				}
			else{
				word=msg.substring(i,i+1)+word;
				}
		i=i-1;
	}
	System.out.println(word);
	}
}
class backwordprint{
	public static void main(String xyz[]){
		bcd y=new bcd();
		y.backwardword("Hello my friends");
	}
}