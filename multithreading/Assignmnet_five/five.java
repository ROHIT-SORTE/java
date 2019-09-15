package Assignmnet_five;

public class five implements Runnable
{
	 public void disp()
	{
//		 synchronized(this)
//		 {
		for(int i=1;i<=50;i++)
		{
			System.out.println(i);
		}
		 //}
	}
	public void disp1()
	{
//		synchronized(this)
//		{
		for(int i=50;i>1;i--)
		{
			System.out.println(i);
		}
		//}
	}
	 public void run()
	{
		synchronized(this)
		{
		disp();
		disp1();
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		five f=new five();
		//five f1=new five();
		Thread t1=new Thread(f);
		Thread t2=new Thread(f);
		//Thread t2=new Thread(f1);
		t1.start();
		t2.start();
	}

}
