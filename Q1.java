class display
{
	synchronized void show()
	{
		for(int i=1;i<=1000;i++)
		{
			System.out.print(i+" ");			
			
			try
			{
				Thread.sleep(10);
			}
			
			catch(Exception e)
			{
				
			}
		}
		System.out.println();
		System.out.println();
	}
}

class MyThread extends Thread
{
	display d;
	
	public MyThread(display d)
	{
		this.d = d;
	}
	
	public void run()
	{
		d.show();
	}
}

class Q1
{
	public static void main(String x[])
	{
		display d = new display();
		MyThread m1 = new MyThread(d);
		m1.setName("T1");
		
		MyThread m2 = new MyThread(d);
		m2.setName("T2");
		
		
		m1.start();
		m2.start();
	}
}