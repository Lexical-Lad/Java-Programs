import java.io.*;
import java.util.*;


class Test21
{
    public static void call(Exception e)
    {
        System.out.println("Exception");
    }
    public static void call(NullPointerException e)
    {
        System.out.println("NullPointer");
    }
    public static void call(Object e)
    {
        System.out.println("Object");
    }
    public static void main(String args[])throws IOException
    {
        call(null);
    }

}
