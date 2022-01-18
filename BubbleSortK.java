import java.util.*;
import java.io.*;
class BubbleSortK
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter size of array");
		int arr_size=Integer.parseInt(br.readLine());
		int arr[]= new int[arr_size];
		System.out.println("Enter an array");
		for(int i=0;i<arr_size;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println("Enter the number of Iterations you want");
		int k= Integer.parseInt(br.readLine());
		
		for(int i=0;i<arr_size;i++)
		{
			if(i==k)
			{
				break;
			}
			for(int j=i+1;j<arr_size;j++)
			{
				
				if(arr[i]>arr[j])
				{
					int temp= arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted array");
		for(int i=0;i<arr_size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}