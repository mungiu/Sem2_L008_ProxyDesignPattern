package BoundedList;

/**
 * Proxy pattern interface
 */
public interface ListADT
{
	void add(String s);

	void add(int idx, String s);

	void set(int idx, String s);

	String get(int idx);

	String remove(int idx);

	int indexOf(String s);

	boolean contains(String s);

	boolean isEmpty();

	int size();
}
