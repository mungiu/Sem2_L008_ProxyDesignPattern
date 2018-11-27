package SeaBear;

public class SeaBearGuard implements IVisitSeaBear<Person>
{
	SeaBear seaBear;
	Child child = new Child();
	ZooKeeper zooKeeper = new ZooKeeper();

	public SeaBearGuard()
	{
		seaBear = new SeaBear();
	}

	@Override
	public void view(Person personType)
	{
		seaBear.view(personType);
	}

	@Override
	public void feed(Person personType)
	{
		if (personType == zooKeeper)
			seaBear.feed(personType);
	}

	@Override
	public void pet(Person personType)
	{
		if (personType == child || personType == zooKeeper)
			seaBear.pet(personType);
	}
}
