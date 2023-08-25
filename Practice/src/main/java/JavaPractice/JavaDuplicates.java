package JavaPractice;

public class JavaDuplicates {
	
	public static void main(String arg[])
	{
	String lang[] = {"Java","C","Ruby","Java", "C"};
	
		for(int i = 0 ; i<lang.length; i++)
		{
			for(int j=i+1;j<lang.length;j++)
			{
				if(lang[i].equals(lang[j]))
				{
				System.out.println("Duplicate is "+lang[i]);
				}
			}
		}
	}

}
