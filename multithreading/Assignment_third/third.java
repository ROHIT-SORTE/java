package Assignment_third;

public class third implements Runnable
{
	synchronized public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		third t=new third();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}

}
