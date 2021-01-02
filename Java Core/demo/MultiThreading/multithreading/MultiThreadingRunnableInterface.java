package multithreading;

public class MultiThreadingRunnableInterface implements Runnable {
	public void run()
	{	System.out.println("thread running"+Thread.currentThread().getId());
	try
	{Thread.sleep(100);}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
		
	}

	public static void main(String[] args) {
		MultiThreading mul1=new MultiThreading();
		MultiThreading mul2=new MultiThreading();
		
		mul1.start();
		mul2.start();
		
	}

}
