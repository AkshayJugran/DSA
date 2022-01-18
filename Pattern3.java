import java.io.*;
class Pattern3
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter number of rows");
		int row=Integer.parseInt(br.readLine());
		for (int i= row; i>= 1; i--)  
		{  
			for (int j=row; j>i;j--)  
			{  
				System.out.print(" ");  
			}  
			for (int k=1;k<=i;k++)  
			{  
				System.out.print("*");  
			}  
		System.out.println("");  
		}
	}
}