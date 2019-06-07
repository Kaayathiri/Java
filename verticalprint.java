class abc{
	public void printword (String msg){
		String word="";
		int i;
		for (i=0;i<msg.length();i++){
			if (msg.substring(i,i+1).equals(" ")){
				System.out.println(word);
				word="";
		}
			else{
				word=word+msg.substring(i,i+1);
			}}
		System.out.println(word);
	}
}
class verticalprint{
	public static void main(String xyz[]){
		abc x=new abc();
		x.printword("Hello my friends my name is kaayathiri");
	}
}