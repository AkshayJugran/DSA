import java.util.*;
import java.io.*;
class BinarySearch
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter an array size");
		int arr_size=Integer.parseInt(br.readLine());
		int arr[]=new int[arr_size];
		for(int i=0;i<arr_size;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=0;i<arr_size;i++)
		{
			for(int j=i+1;j<arr_size;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("Sorted array is "); 
		for(int i=0;i<arr_size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}