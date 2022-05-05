import java .util.*;
import java .io.*;
public class InsertionSort
{
	private static void printArray(int[] a1)
{
	for (int n : a1)
	{
		System.out.print(n + " ");
	}
	System.out.println("");
}

public static void insertIntoSorted(int[]a1){
int length = a1.length;
int elemnetNeedTobeinserted = a1[ length -1];
for(int i =length -2; i>=0;i--)
{ 
if (a1[i] > elemnetNeedTobeinserted)
{
	a1[i+1]= a1[i];
	printArray(a1);
}
else {
	a1[i+1] =  elemnetNeedTobeinserted;
	printArray(a1);
	break;
}
if ((i==0) && (a1[i] > elemnetNeedTobeinserted))
{a1[i] =  elemnetNeedTobeinserted;
printArray(a1);
}
}
}
public static void main (String[]args)
{
	Scanner sc = new Scanner(System.in);
	int s = sc.nextInt();
	int[]a1 = new int[s];
	for (int i =0; i<s; i++)
	{
		a1[i] = sc.nextInt();
	}
	insertIntoSorted(a1);
	sc.close();
}
}	