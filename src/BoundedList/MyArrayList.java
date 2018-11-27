package BoundedList;

import java.util.ArrayList;

public class MyArrayList implements ListADT
{
	ArrayList<String> stringArrayList;
	int size;

	public MyArrayList(int size)
	{
		stringArrayList = new ArrayList<>(size);
		this.size = size;
	}


	@Override
	public void add(String s)
	{
		if (stringArrayList.size() >= size)
			throw new IllegalStateException();
		else
			stringArrayList.add(s);
	}

	@Override
	public void add(int idx, String s)
	{
		if (stringArrayList.size() >= size || stringArrayList.get(idx) == null)
			throw new IllegalStateException("List is full");
		else
			stringArrayList.set(idx, s);
	}

	@Override
	public void set(int idx, String s)
	{
		stringArrayList.set(idx, s);
	}

	@Override
	public String get(int idx)
	{
		if (!stringArrayList.isEmpty())
			return stringArrayList.get(idx);
		else
			throw new NullPointerException("List is empty");
	}

	@Override
	public String remove(int idx)
	{
		if (stringArrayList.get(idx) != null)
		{
			String temp = stringArrayList.get(idx);
			stringArrayList.remove(idx);
			return temp;
		}
		else
			throw new NullPointerException("There is nothing at index " + idx);
	}

	@Override
	public int indexOf(String s)
	{
		if (stringArrayList.contains(s))
			return stringArrayList.indexOf(s);
		else
			throw new NullPointerException("This element dos not exist in the array list: " + s);
	}

	@Override
	public boolean contains(String s)
	{
		return stringArrayList.contains(s);
	}

	@Override
	public boolean isEmpty()
	{
		return stringArrayList.isEmpty();
	}

	@Override
	public int size()
	{
		return stringArrayList.size();
	}
}
