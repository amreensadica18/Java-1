public class HexToDecimal_userdefinedmethodExample{    
   public static int hexToDecimal(String hexnum){  
	String hstring = "0123456789ABCDEF";  
	hexnum = hexnum.toUpperCase();  
	int num = 0;  
	for (int i = 0; i < hexnum.length(); i++)  
	{  
		char ch = hexnum.charAt(i);  
		int n = hstring.indexOf(ch);  
		num = 16*num + n;  
	}  
	return num;  
   }  
   public static void main(String args[]){    
	System.out.println("Decimal equivalent of 7A is: "+hexToDecimal("7A"));    
   }
}
