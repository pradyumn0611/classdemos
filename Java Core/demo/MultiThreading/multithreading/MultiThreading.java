package multithreading;

public class MultiThreading extends Thread {
	public void run()
	{
		System.out.println("thread running"+Thread.currentThread().getId());
		try
		{Thread.sleep(100);}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args)
	{


		for (int i=1;i<=10;i++)
		{
			MultiThreading mul1=new MultiThreading();
			MultiThreading mul2=new MultiThreading();
			
			mul1.start();
			mul2.start();
			
			

		}
	}
}
