import java.util.*;
import java.io.*;

class Selection_sort
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int testCases;
		testCases=Integer.parseInt(br.readLine());
		while(testCases>0)
		{
			int i,j,min,temp=0;
			int arr_size=Integer.parseInt(br.readLine());
			int arr[]=new int[arr_size];
			for(i=0;i<arr_size;i++)
			{
				arr[i]=Integer.parseInt(br.readLine());
			}
			for(i=0;i<arr_size;i++)
			{
				min=i;
				for(j=i+1;j<arr_size;j++)
				{
					if(arr[j]<arr[min])
					{
						min=j;
					}
					
					if(min!=i)
					{
						temp=arr[min];
						arr[min]=arr[i];
						arr[i]=temp;
					}
				}
			}
			for(i=0;i<arr_size;i++)
			{
				System.out.println("Sorted"+arr[i]);
			}
			testCases--;
		}
	}
}