package RequestLogging;

public class ProxyTaskList
{
	private TaskList taskList;
	private int countAdded;
	private int countTaken;

	public ProxyTaskList()
	{
		taskList = new TaskList();
	}

	public synchronized void addTask(String task, String author)
	{
		//adding the task to the list
		taskList.addTask(task, author);
		countAdded++;
		if (countAdded % 10 == 0)
			System.out.println("10 tasks added");

	}

	public synchronized String takeNextTask(String worker)
	{
		String temp = taskList.takeNextTask(worker);
		countTaken++;

		if (countTaken % 10 == 0)
			System.out.println("10 tasks taken");
		return temp;
	}

}

