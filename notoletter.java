class digittowords {
	private String ones (int Num){
		String word="";
	

		switch (Num){
		case 1: word=" One"; break;
		case 2: word=" Two"; break;
		case 3: word=" Three"; break; 
		case 4: word=" Four"; break;
		case 5: word=" Five"; break;
		case 6: word=" Six"; break;
		case 7: word=" Seven"; break;
		case 8:word=" Eight"; break;
		case 9: word=" Nine"; break;
		case 10:word=" Ten"; break;
		case 11:word=" Eleven"; break;
		case 12:word=" Twelve"; break;
		case 13:word=" Thirteen"; break;	
		case 14:word=" Fourteen"; break;
		case 15:word=" Fifteen"; break;
		case 16:word=" Sixteen"; break;
		case 17:word=" Seventeen"; break;
		case 18:word=" Eighteen"; break;
		case 19:word=" Nineteen"; break;
		}
		return (word);

}
	

	private String tens(int Num){
		String word="";

	
	switch (Num){
		
		case 20:word=" Twenty"; break;
		case 30:word=" Thirty"; break;
		case 40:word=" Fourty"; break;
		case 50: word=" Fifty"; break;
		case 60:word=" Sixty"; break;
		case 70:word=" Seventy";break;
		case 80:word=" Eighty";break;
		case 90:word=" Ninety"; break;
}
		return (word);
	
}
	public void convert (int Num){
		String answer="";
		if (Num>=1000 && Num<=9999){
			answer=ones(Num/1000)+" Thousand";
			Num=Num%1000;
		}
		if (Num>=100){
			answer+=ones(Num/100)+ " Hundred";
			Num=Num%100;
		}
		if (Num>=20){
			answer+=tens(Num/10*10);
			Num=Num%10;
		}
		if (Num>0 && Num<20){
			answer+=ones(Num);
		}
	System.out.println(answer);
	}
}
class notoletter{
	public static void main(String xyz[]){
		digittowords c=new digittowords();
		c.convert(9734);

	}
}