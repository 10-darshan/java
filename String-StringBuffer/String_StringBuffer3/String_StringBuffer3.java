import java.io.*;
import java.util.*;
public class String_StringBuffer3
{	
	public static void main(String[] args) 
	{
		String str = "Wipro";
		int n = str.length();
		String repeater = "";
		if (n < 2) 
			repeater = str;
		else 
			repeater = str.substring(0, 2);
		String output = "";
		for (int i = 0; i < n; i++) 
		{
			output += repeater;
		}
		System.out.println(output);
	}
}