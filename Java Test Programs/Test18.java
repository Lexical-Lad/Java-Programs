import java.io.*;

class Test18

{
		public static void main(String args[])throws IOException

		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

			String s=xx.readLine();

			String ss[]=s.split(" ");

			System.out.println(s.length());
			System.out.println(ss.length);
			System.out.println(ss[0]);
		}
	}


