import java.io.*;

class Test1

{
	public static void main(String args[])throws IOException

	{

		BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

		String s=xx.readLine();

		String a[]=s.split(" ");

		System.out.println(a.length);

	}

}


