package Test;

public class StringActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Reverse
				String str1 = "Aqsa Syeda Idrish";
				int strLen = str1.length();
				for(int i = strLen-1;i>=0;i--)
				{
					System.out.print(str1.charAt(i));
				}
				
		//count of vowels
				String str = "aeiou";
				int j, count = 0;
				for(j=0;j<str.length();j++)
				{
					char ch = str.charAt(j);
					if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					{
						count++;
					}
					
				}
				System.out.println("Vowel count is "+count);
				System.out.println("Bubble sort");
			//bubble sort
				int st1[] = {1,5,9,7,45,34};
				//System.out.println(st1[]);
				int k,l,temp=0;
				for(k=0;k<st1.length;k++)
				{
					for(l=1;l<st1.length-k;l++)
					{
						if(st1[l-1] > st1[l])
						{
							temp = st1[l-1];
							st1[l-1] = st1[l];
							st1[l]=temp;
						}
						
					}
				}
				for(int m=0;m<st1.length;m++)
				{
					System.out.print(st1[m]+" ");
				}
				
				
	}

}
