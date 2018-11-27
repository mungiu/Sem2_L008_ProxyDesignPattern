package SeaBear;

public class SeaBear implements IVisitSeaBear<Person>
{
	@Override
	public void view(Person personType)
	{
		System.out.println("The bear is viewed by " + personType);
	}

	@Override
	public void feed(Person personType)
	{
		System.out.println("The bear is fed by " + personType);
	}

	@Override
	public void pet(Person personType)
	{
		System.out.println("The bear is pet by " + personType);
	}
}
