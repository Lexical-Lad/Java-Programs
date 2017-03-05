import java.io.*;
import java.util.*;
import java.text.*;

class Test17

{
		public static void main(String args[])throws IOException

		{
			BufferedReader xx=new BufferedReader(new InputStreamReader(System.in));

			Calendar c=Calendar.getInstance();

			DateFormat df=new SimpleDateFormat("ddMMyyyy HH");

			String s=df.format(c.getTime());

			System.out.println(s);

			System.out.println(c.getTime());
		}
}
