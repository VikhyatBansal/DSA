import java.util.*;

public class Stackarray {
    public static void main(String[] args)
{
	twoStacks ts = new twoStacks(5);
	ts.push1(55);
	ts.push2(9);
	ts.push2(69);
	ts.push1(72);
	ts.push2(37);
	System.out.print("Popped element from stack1 is "
					+ " : " + ts.pop1() +"\n");
	ts.push2(46);
	System.out.print("Popped element from stack2 is "
					+ ": " + ts.pop2()
					+"\n");
}
}
class twoStacks
{

int[] arr;
int size;
int top1, top2;

// Constructor
twoStacks(int n)
{
	size = n;
	arr = new int[n];
	top1 = n / 2 + 1;
	top2 = n / 2;
}

// Method to push an element x to stack1
void push1(int x)
{

	// There is at least one empty
	// space for new element
	if (top1 > 0)
	{
	top1--;
	arr[top1] = x;
	}
	else
	{
	System.out.print("Stack Overflow"
					+ " By element :" + x +"\n");
	return;
	}
}

// Method to push an element
// x to stack2
void push2(int x)
{

	// There is at least one empty
	// space for new element
	if (top2 < size - 1)
	{
	top2++;
	arr[top2] = x;
	}
	else
	{
	System.out.print("Stack Overflow"
					+ " By element :" + x +"\n");
	return;
	}
}

// Method to pop an element from first stack
int pop1()
{
	if (top1 <= size / 2)
	{
	int x = arr[top1];
	top1++;
	return x;
	}
	else
	{
	System.out.print("Stack UnderFlow");
	System.exit(1);
	}
	return 0;
}

// Method to pop an element
// from second stack
int pop2()
{
	if (top2 >= size / 2 + 1)
	{
	int x = arr[top2];
	top2--;
	return x;
	}
	else
	{
	System.out.print("Stack UnderFlow");
	System.exit(1);
	}
	return 1;
}
}
