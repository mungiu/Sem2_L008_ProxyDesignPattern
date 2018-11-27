package Logger;

public class Main
{
	public static void main(String[] args)
	{
		ProxyLogger proxyLogger = new ProxyLogger("sparse");
		ThreadSafeBoundedQueue threadSafeBoundedQueue = new ThreadSafeBoundedQueue(10);
	}
}
