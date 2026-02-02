package mypack.java;

import java.io.*;

class Fibinacci 
{
	public static void main(String[] args) 
		throws IOException
	{
		BufferedReader indata = new BufferedReader(new InputStreamReader(System.in));
		int i = 0;
		int k = 1;
		int s = 0;
		System.out.println(" enter the number: ");
		int d = Integer.parseInt(indata.readLine());
		System.out.print(+i + "," +k);
		for(int n=0; n<=d; n++)
		{
			s = i + k;
			System.out.print( ","+ s);
			i = k;
			k = s;
		}
	}
}
