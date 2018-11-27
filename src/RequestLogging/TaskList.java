package RequestLogging;

import java.util.ArrayList;

public class TaskList implements ITaskList
{
	private ArrayList<String> taskList;

	public TaskList()
	{
		taskList = new ArrayList<>();
	}

	@Override
	public void addTask(String task, String author)
	{
		taskList.add(task);
		System.out.println("Added task by : " + author);
	}

	@Override
	public String takeNextTask(String worker)
	{

		if (taskList.isEmpty())
		{
			System.out.println("Task list is empty");
			return null;
		}
		else
		{
			String temp = taskList.get(0);
			taskList.remove(0);
			System.out.println("Task taken by : " + worker);
			return temp;
		}
	}
}
