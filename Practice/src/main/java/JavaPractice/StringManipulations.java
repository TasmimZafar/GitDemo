package JavaPractice;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String revVal = "";
		String str1 = "Aqsa is my Daughters name, she is so cute baby";
		int i,iLen = str1.length();
		
		for ( i = iLen-1; i >= 0  ;i--)
		{
			revVal = revVal+str1.charAt(i);
		}
		System.out.println(revVal);
		
		int iArray[] = {1,2,3,4,5};
		
		System.out.println(iArray[2]);
		
		String sArray1[] = {"I", "love", "Hubby"};
		//String sArray2[] = {"I", "love", "Idrish"};
		String sArray2[] = new String[3];
		for(int j=0;j<=sArray1.length-1;j++)
		{
			System.out.println(sArray1[j]);
		}
		sArray2[0] = "KGF";
		sArray2[1] = "KGF1";
		sArray2[2] = "KGF2";
		for(int k=0;k<=sArray2.length-1;k++)
		{
			System.out.println(sArray2[k]);
		}
		
	}

}
