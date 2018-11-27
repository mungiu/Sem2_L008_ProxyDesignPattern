package RequestLogging;

public class Main
{
	public static void main(String[] args)
	{
		ProxyTaskList proxyTaskList = new ProxyTaskList();

		new Thread(new TaskPutter(proxyTaskList)).start();
		new Thread(new TaskPutter(proxyTaskList)).start();
		new Thread(new TaskTaker(proxyTaskList)).start();
		new Thread(new TaskTaker(proxyTaskList)).start();
	}
}