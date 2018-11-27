package RequestLogging;

import static java.lang.Thread.sleep;

public class TaskTaker implements Runnable
{
	private ProxyTaskList proxyTaskList;

	public TaskTaker(ProxyTaskList proxyTaskList)
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
				sleep(3000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			proxyTaskList.takeNextTask(Thread.currentThread().getName());
		}
	}


}
