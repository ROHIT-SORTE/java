package Assignment;

public class first extends Thread
{
	public void run()
	{
		for(int i='A';i<='J';i++)
		{
			System.out.println((char)i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first f1=new first();
		first f2=new first();
		f1.start();
		f2.start();
	}

}
