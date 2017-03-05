import java.io.*;

class Test14

{
	public static void main(String args[])throws IOException

	{
		String s="Motherfucker";

		for(char c: s.toCharArray()) // Just for(char c: s) gives compilation error
		System.out.print(c);

		System.out.println();
	}
}
