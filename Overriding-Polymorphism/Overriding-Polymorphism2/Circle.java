package Overriding-Polymorphism2;
public class Circle extends Shape 
{
	@Override
	public void draw() 
	{
		System.out.println("Drawing Circle");
	}
	@Override
	public void erase() 
	{
		System.out.println("Erasing Circle");
	}
}