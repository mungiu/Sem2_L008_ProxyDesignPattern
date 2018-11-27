package Logger;

import Logger.Interfaces.ILog;

public class Logger implements ILog<String>
{
	public Logger() { }

	@Override
	public void log(String txt)
	{
		System.out.println(txt);
	}
}
