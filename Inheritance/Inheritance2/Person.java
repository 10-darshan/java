import java.io.*;
import java.util.*;
package Inheritance2;
public class Person 
{
	protected String name;
	public Person(String name) 
	{
		this.name = name;
	}
	public String getName() 
	{
		return name;
	}
	@Override
	public String toString() 
	{
		return "Person [name=" + name + "]";
	}
}