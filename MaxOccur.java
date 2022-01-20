/*1.Write a program to return the maximum occurring character in the input string*/
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.io.*;
public class MaxOccur
{
	public static void PrintMaxOccur(String inputStr)
	{
		HashMap<Character , Integer> CharCountMap = new HashMap<>();
		char[] charArray =  inputStr.replaceAll("\\s+"," ").toCharArray();
		
		for(char c : charArray)
		{
			if(CharCountMap.containsKey(c))
			{
				CharCountMap.put(c,CharCountMap.get(c)+1);
			}
			else
			{
				CharCountMap.put(c,1);
			}
		}
		
		Set<Entry<Character,Integer>> entrySet = CharCountMap.entrySet();
		
		int maxCount=0;
		int maxChar=0;
		
		for(Entry<Character , Integer> entry : entrySet)
		{
			if(entry.getValue() > maxCount)
			{
				maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
			}
		}
		System.out.println("The maximum occurring character is :" + Character.toString (maxChar));
		System.out.println("Frequency of maximum occurring character is :"+ maxCount);
	}
	
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter a String");
		String Input = br.readLine();
		PrintMaxOccur(Input);
	}
}