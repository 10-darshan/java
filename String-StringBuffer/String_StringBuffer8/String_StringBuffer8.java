import java.io.*;
import java.util.*;
public class String_StringBuffer8
{	
	public static void main(String[] args) 
	{
		String str = "ab*cd";
		String[] strs = str.split(".[\\*]+.");
		StringBuffer sb = new StringBuffer();
		for (String x : strs)
			sb.append(x);
		System.out.println(sb);
	}
}