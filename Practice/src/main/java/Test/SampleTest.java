package Test;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data = null;
		String testtemp = "JP Morgan Mumbai";
		int len = testtemp.length()-1;
		for(int i = len; i>=0; i--)
		{
		
			System.out.print(testtemp.charAt(i));
			data = data + testtemp.charAt(i);
		}
		System.out.println("---------");
		//System.out.print(data);
		
		String data1[] = data.split(" ");
		//for(String j:data1)
		for(int j=data1.length-1;j>=0;j--)
		{
		System.out.print(data1[j]+" ");
		}
		
		
		SampleTest s = new SampleTest (); 
		
	}

}


