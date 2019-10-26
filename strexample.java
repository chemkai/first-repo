import java.io.*;
import java.lang.String;


public class strexample
{
	public static void main(String args[])
	{
		//Creating using double quotes or literal strings
		//str1 and str2 are reference variables pointing to the same literal
		String str1="OOP";
		String str2="OOP";
		if(str1==str2)
		{
			System.out.println("str1 = str2");
		}
		else
		{
			System.out.println("str1!=str2");
		}
		//String creation using new keyword
		//str3 and str4 are reference variables which are pointing to 2 different obhjects whose content is same
		String str3=new String("OOP");
		String str4=new String("OOP");
		if(str3==str4)
		{
			System.out.println("str3 = str4");
		}
		else
		{
			System.out.println("str3!=str4");
		}
		//Conclusion is that == performs address comparison
		if(str3.equals(str4))
		{
			System.out.println("str3 = str4");
		}
		else
		{
			System.out.println("str3!=str4");
		}
		//Conclusion is that .equals() method comapres the content within
		if(str3.compareTo(str4)==0)
		{
			System.out.println("str3 is comared to str4");
		}
		else
		{
			System.out.println("str3 is not compared to str4");
		}
		String str="John, Jennie, Jim, Jack, Joe";
		System.out.println(str);
		
		//Checking the length
		int len=str.length();
		System.out.println("Length of str is:"+len);
		
		//Checking the start and end characters of a string
		System.out.println(str.charAt(0)+"|||"+str.charAt(len-1));
		
		//Checking the function toUpperCase
		str.toUpperCase();
		System.out.println("str after uppercase is:"+str);//No changes:strings are IMMUTABLE
		String s1=str.toUpperCase();
		System.out.println("str after uppercase is:"+s1);
		
		//Checking whether the string contains a particular word
		if(str.contains("Jim"))
		{
			System.out.println("Jim is in the string");
		}
		else
		{
			System.out.println("Jim is not in the string");
		}
		
		//Creation of sub-strings
		String s2=str.substring(5);
		System.out.println("The substring is :"+s2);
		String s3=str.substring(6,10);
		System.out.println("The substring s3 is::"+s3); //starts with 6th index and ends with 9th index
		
		//Replacing characters in the strings
		String s4=str.replace('J','K');
		System.out.println(s4);
		
		//Converting strings to char array
		char charr[] = str.toCharArray();
		for(int i=0;i<charr.length;i++)
		{
			System.out.print(charr[i]+"|");
		}
		//Spliting the string on the basis of a pattern
		String strarr[]=str.split(",");
		for(int i=0;i<strarr.length;i++)
		{
			System.out.println(strarr[i].trim());//Trims the white spaces
		}
		
		//Checking validity of data
		String email="john@example.com";
		String phone="9999888800";
		String pass="password123";
		
		//Validate the data
		
		if(!email.isEmpty())
		{
			System.out.println("Email is available");
		}
		else
		{
			System.out.println("Email is not available");
		}
		
		
		//Modified version of validating
		if(!email.isEmpty())
		{
			System.out.println("Email is available");
			if((!email.contains("@")) && (!email.contains(".")))
			{
				System.out.println("But the email is not valid");
			}
			else
			{
				System.out.println("Email is a valid one");
			}
		}
		else
		{	
			System.out.println("Please provide an email:");
		}
		
		
		//code to check for phone number
		if(!phone.isEmpty())
		{
			System.out.println("Phone number is available");
		}
		else
		{
			System.out.println("Phone number is not available");
		}
		
		
		//Modified version
		if(!phone.isEmpty())
		{
			System.out.println("Phone number available");
			if(!(phone.length()==10))
			{
				System.out.println("Not a valif phone number:");
			}
			else
			{
				System.out.println("Valid Phone number");
			}
		}
		else
		{
			System.out.println("Phone number field is empty");
		}
		
		//Strings are immutable example
		String string =new String("Hello");
		string.concat(" World");
		System.out.println(string);
		
		StringBuffer buffer=new StringBuffer("Hello"); //String Buffer is Thread safe
		buffer.append(" World");
		System.out.println("buffer is::"+buffer);
		
		
		StringBuilder builder = new StringBuilder("Hello");//String Builder is not Thread safe
		builder.append(" World");
		System.out.println("builder is ::"+builder);
		
		
		
	}	
		
}
		