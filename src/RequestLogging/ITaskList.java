package RequestLogging;

public interface ITaskList
{
	void addTask(String task, String author);

	String takeNextTask(String worker);
}
