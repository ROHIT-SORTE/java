package Assignment_four;

public class four_class_lock implements Runnable
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
		four_class_lock fr=new four_class_lock();
		four_class_lock fr1=new four_class_lock();
		Thread t1=new Thread(fr);
		Thread t2=new Thread(fr1);
		t1.start();
		t2.start();
	}

}
