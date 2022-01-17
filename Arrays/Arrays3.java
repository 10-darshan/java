import java.io.*;
import java.util.*;
public class Arrays3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] array = {1,4,34,56,7};
		System.out.println("Enter a number to search");
		int n=sc.nextInt();
		int c=-1;
		for(int i=0;i<array.length;i++)
		{
			if(n==array[i]){
				c=3;
				break;
			}
		}
		System.out.println(c);
	}
}