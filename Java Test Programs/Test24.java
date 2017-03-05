import java.io.*;

class Test24
{
	public static void main(String args[])throws IOException

	{
		String s="123+456";

		String j="" +Integer.parseInt("123")+Integer.parseInt("456");
		String k=String.valueOf(Integer.parseInt("123")+Integer.parseInt("456"));  //String k=Integer.parseInt("123")+Integer.parseInt("456"))  yields an error(incompatible types)
		 // String l=(String)(Integer.parseInt("123")+Integer.parseInt("456"));  this yields the same 'incompatible types' error
		System.out.println(k);

	}
}