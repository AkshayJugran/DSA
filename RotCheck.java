// To check the rotation of a string is equal or not
import java.util.*;
import java.io.*;
//import jaa.util.rotation.*;

class RotCheck
{
	public static void main(String args[]) throws IOException
	{
		List<Character> myList = new ArrayList<>();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a String");
		String str= br.readLine();
		System.out.println("Enter Another String");
		String str2=br.readLine();
		char arr[] = str.toCharArray();
		char arr2[] =str2.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			myList.add(arr[i]);
		}
		List<Character> myList1 = new ArrayList<>();
		for(int i=0;i<arr2.length;i++)
		{
			myList1.add(arr2[i]);
		}
		
		Collections.rotate(myList,1);
		System.out.println(myList);
		System.out.println(myList1);
		boolean bool = myList.equals(myList1);
		System.out.println(bool);
	}
}