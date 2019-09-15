package Assignment_four;



public class four implements Runnable
{
	synchronized public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		four fr=new four();
		Thread t1=new Thread(fr);
		Thread t2=new Thread(fr);
		t1.start();
		t2.start();
	}

}
