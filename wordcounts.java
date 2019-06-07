class stringprocessing{
	public void wordcount(String msg){
	int word=1;
	int i; 	
	 for (i=0;i<msg.length();i++){
	 	if (msg.substring(i,i+1).equals(" ")){
	 		word++;
	 	}

	 }
		System.out.println(word);
}
}

class wordcounts{
	public static void main(String xyz[]){
		stringprocessing s=new stringprocessing();
		s.wordcount("Hello my friends");
	}
}