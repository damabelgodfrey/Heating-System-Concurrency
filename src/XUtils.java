
enum XUtils {;
	
	public static void sleepForRandomTime(String threadName) throws InterruptedException
	{
		int sleepTime = (int)(Math.random() * 2000);
		Thread.sleep(sleepTime);
		System.out.println(threadName + "Thread sleeps by: " + sleepTime + " milliSecounds");
	}
}
