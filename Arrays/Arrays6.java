import java.io.*;
import java.util.*;
public class Arrays6
{
	public static void main(String[] args) 
	{
		int[] array = {48, 55, 68, 88, 101, 122};
		for (int i = 0; i < array.length - 1; i++) 
		{
			for (int j = 0; j < array.length - i - 1; j++) 
			{
				if (array[j] > array[j + 1]) 
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
}