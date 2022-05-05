import java .util.*;
import java .io.*;
public class TwoStacks
{
private int arr[];
private int size;
private int index1;
private int index2;

public TwoStacks(int size)
{
	this.size = size;
	arr = new int[size];
	index1 = -1;
	index2 = size;
}
public void push1(int element)
{
	if(isFull())
	{
		throw new StackOverflowError("Two Stacks is Full");
	}	
	arr[ ++ index1 ] = element;
}


public void push2(int element)
{
	if(isFull())
	{
		throw new StackOverflowError("Two Stacks is Full");
	}
	arr[--index2] = element;
}
public int pop1()
{
	if(isEmpty1())
	{
		throw new EmptyStackException();
	}
	int element = arr[index2];
	index2++;
	
	return element;
}

public int pop2()
{
	if(isEmpty2())
	{
		throw new EmptyStackException();
	}
	int element = arr[index2];
	index2++;
	
	return element;
}

public boolean isEmpty1()
{
	if(index1 == -1)
	{
		return true;
	}
	return false;
}

public boolean isFull()
{
	if (index1 == index2)
	{
		return true;
	}
	return false;
}

public boolean isEmpty2()
{
if (index2 == size)
{
	return true;
}
return false;
}


public static void main(String [] args)
{
	TwoStacks sc =  new TwoStacks(5);
	sc.push1(5);
    sc.push2(10);
	sc.push2(15);
	sc.push1(11);
	sc.push2(7);
	
	System.out.println("Popped element from stack1 is "+sc.pop1());
	sc.push2(40);
	System.out.println("Popped element from stack1 is "+sc.pop2());
}
}