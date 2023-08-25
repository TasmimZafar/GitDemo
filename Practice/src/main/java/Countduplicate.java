
public class Countduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s="mmababctamantlslmag";
		    int distinct = 0 ;
		    int i;
		    for ( i = 0; i < s.length(); i++) {

		        for (int j = 0; j < s.length(); j++) {

		            if(s.charAt(i)==s.charAt(j))
		            {
		                distinct++;

		            }
		        }   
		
		    }
		    System.out.println(s.charAt(i)+"--"+distinct);
	}

}
