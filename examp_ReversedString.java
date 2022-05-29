package practiseProgram;

class reverseString {
	public static String reverseLineProccess(String Line)
	{
		String[] arrOfStr = Line.split(" ");
		String ReverseWord=" ";
		int len=0;
		for (String a : arrOfStr)
		{   String Word=" ";
			len= a.length();
			for(int i=len-1; i>=0;i--)
			{ Word+=a.charAt(i);	

			}
			ReverseWord+=Word;
		//System.out.print(Reverse);
		}
		return ReverseWord;
	}
}


public class examp_ReversedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = "Welcome for geekss Hello GreeksssS GreeK";
        String Result= reverseString.reverseLineProccess(str);
        System.out.println(Result);
	
	}

}
