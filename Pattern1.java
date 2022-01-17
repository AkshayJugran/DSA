import java.io.*;
class Pattern1
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		System.out.println("Enter number of lines");
		int rows=Integer.parseInt(br.readLine());
		for(int i=0;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}