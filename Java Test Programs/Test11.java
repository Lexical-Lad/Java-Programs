import java.io.*;
class Test11
{
  public void finalize() { System.out.println("finalizing!"); }


private static void f() throws Throwable
{
   Test11 blah = new Test11();
   blah.finalize();
}

public static void main(String[] args) throws Throwable
{
	System.out.println("start");
	f();
	System.gc();
	System.out.println("done");
}}
