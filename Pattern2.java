import java.io.*;

class Pattern2
{
	public static void main(String args[]) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int rows=Integer.parseInt(br.readLine());
		for(int i=1;i<=rows;i++)
		{
			for(int j=i;j<=rows;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}
}