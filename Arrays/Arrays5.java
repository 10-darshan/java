import java.io.*;
import java.util.*;
public class Arrays5
{
	public static void main(String[] args) 
	{
		int[] array = {48, 55, 68, 88, 101, 122};
		Arrays.sort(array);
		System.out.println("Smallest two in the array: " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array: " + array[array.length-1] + " and " + array[array.length-2]);
	}
}