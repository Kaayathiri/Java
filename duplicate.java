class hellokath{
	String newmessage=" ";
	public int findword(String searchingfor){
		String word2="";
		int i=0;
		while (i<newmessage.length()){
			if (newmessage.substring(i,i+1).equals(" ")){
				if (word2.equals(searchingfor)){
					return 1;
				}
				word2="";
			}
			else {
				word2=word2+newmessage.substring(i,i+1);
			}
			i++;
	}
	return 0;
	}
	public void removeduplicate(String msg){
		String word="";
		msg=msg+" ";
		int i=0;
		while (i<msg.length()){
			if (msg.substring(i,i+1).equals(" ")){
				if (findword(word)==0){
					newmessage+=(word+" ");
				}
				word="";

			}
			else {
				word=word+msg.substring(i,i+1);
			}
			i++;
	}
	System.out.println(newmessage);
	}
}

class duplicate{
	public static void main(String xyz[]){
		hellokath x=new hellokath();
		x.removeduplicate("hello my friend and my friend friend friend friend friend shafeeq");
	}
}
