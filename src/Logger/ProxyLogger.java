package Logger;

import Logger.Interfaces.ILog;

public class ProxyLogger implements ILog<String>
{
	String logLevel;
	Logger logger;

	public ProxyLogger(String logLevel)
	{
		logger = new Logger();
		this.logLevel = logLevel;
	}

	public void log(String txt)
	{
		// only messages containing error word go in log
		if (logLevel == "sparse" & txt.contains("error"))
			logger.log(txt);
			//everything foes into the log
		else if (logLevel == "verbose")
			logger.log(txt);
		else
			System.out.println("Wrong logLevel defined, please remake proxyLogger");
	}
}
