package Test;

public class CountOfObject  
{  
//variable to keep track of objects  
private static int count;  
//constructor of the class  
public CountOfObject()   
{  
// increase the count variable by 1  
count++;  
}  
public static void main(String args[])   
{  
//creating objects  
	CountOfObject ob1 = new CountOfObject();  
	CountOfObject ob2 = new CountOfObject();  
	CountOfObject ob3 = new CountOfObject();  
	CountOfObject ob4 = new CountOfObject();  
	CountOfObject ob5 = new CountOfObject();  
//prints number of objects  
System.out.print("Total Number of Objects: " + CountOfObject.count);  
}  
}  