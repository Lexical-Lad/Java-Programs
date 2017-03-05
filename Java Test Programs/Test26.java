import java.io.*;
import java.util.*;


class Test26
{

	static void stringCheck(String t)
	{
		t+=" Off";
	}

	static void stringCheck2(String s[])
	{

		s[0]+=" Off";
	}

	public static void main(String args[])throws IOException

	{

		String t="Fuck";

		stringCheck(t);

		System.out.println(t);


		String s[]={"Fuck"};
		stringCheck2(s);
		System.out.println(s[0]);

	}

}