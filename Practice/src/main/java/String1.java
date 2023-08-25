import java.io.*;
import java.lang.*;
public class String1 {

	
	 static int ind;
	   
	    static void removal(String s)
	    {
	        for(ind = 0; ind < s.length(); ind++)
	        {
	            char ch = s.charAt(ind);
	            if(ch != ' ')
	            System.out.print(ch);
	        }
	    }
	   public String ReplaceALL(String str1 , String str2)
	   {
		   String s1 = str1.replaceAll(str1, str2);
		return s1;
	   }
	   public String Replace(String str1 , Character c1, Character c2)
	   {
		   String s1 = str1.replace(c1, c2);
		   return s1;
		
	   }
	    public static void main (String args[])
	    {
	    	String1 sData = new String1(); 
	    	//String1.removal("   coding ninjas    ");
	    	//String s = sData.ReplaceALL("I love hubby", "IDRISH");
	    	//System.out.println(s);
	    	String st = sData.Replace("IDRISH Is In India",'I','e');
	    	System.out.println(st);
	    }
	    
}

