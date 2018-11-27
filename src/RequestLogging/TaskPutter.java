package RequestLogging;

import static java.lang.Thread.sleep;

public class TaskPutter implements Runnable
{
	private ProxyTaskList proxyTaskList;

	public TaskPutter(ProxyTaskList proxyTaskList)
	{
		this.proxyTaskList = proxyTaskList;
	}

	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			proxyTaskList.addTask("task added", Thread.currentThread().getName());
		}
	}
}
