package Assignment_second;

public class second implements Runnable
{
	public void run()
	{
		for(int i='A';i<='J';i++)
		{
			System.out.println((char)i);
		}
	}
	public static void main(String args[])
	{
		second ob=new second();
		Thread t1=new Thread(ob);
		Thread t2=new Thread(ob);
		t1.start();
		t2.start();
	}
}