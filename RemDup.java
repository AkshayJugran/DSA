// Remove duplicate characters from string 
import java.util.*;
import java.io.*;

class RemDup
{
	static void removeDuplicates(String Inputstr)
	{
		LinkedHashSet <Character> set = new LinkedHashSet<>();
		for(int i=0;i<Inputstr.length();i++)
		{
			set.add(Inputstr.charAt(i));
		}
		
		for(char ch : set)
		{
			System.out.print(ch);
		}
	}


	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a String");
		String str=br.readLine();
		removeDuplicates(str);
	}
}