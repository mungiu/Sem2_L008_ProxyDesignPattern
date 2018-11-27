package Logger;

import Logger.Interfaces.QueueADT;

/**
 * A proxy that works as a layer for thread safety by adding synchronized keyword to every method
 */
public class ThreadSafeBoundedQueue implements QueueADT<String>
{
	BoundedArrayQueue<String> boundedArrayQueue;

	public ThreadSafeBoundedQueue(int capacity)
	{
		boundedArrayQueue = new BoundedArrayQueue<String>(capacity);
	}

	public synchronized String toString()
	{
		return "FINALIZE";
	}

	@Override
	public synchronized void enqueue(String element)
	{
		boundedArrayQueue.enqueue(element);
	}

	@Override
	public synchronized String dequeue()
	{
		return boundedArrayQueue.dequeue();
	}

	@Override
	public synchronized String first()
	{
		return boundedArrayQueue.first();
	}

	@Override
	public synchronized int size()
	{
		return boundedArrayQueue.size();
	}

	@Override
	public synchronized boolean isEmpty()
	{
		return boundedArrayQueue.isEmpty();
	}

	@Override
	public synchronized int indexOf(String element)
	{
		return boundedArrayQueue.indexOf(element);
	}

	@Override
	public synchronized boolean contains(String element)
	{
		return boundedArrayQueue.contains(element);
	}
}
