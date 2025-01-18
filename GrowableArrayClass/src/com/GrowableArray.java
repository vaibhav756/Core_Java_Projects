package com;

public class GrowableArray {

	int count;
	int arr[];
	
	public GrowableArray() {
		arr=new int[count];
	}
	
	public GrowableArray(int count)
	{
		//this.count=count;
		arr=new int[count];
	}
	
	public GrowableArray(int count,int arr[])
	{
		this.count=count;
		this.arr=arr;
	}
	
	public static void main(String[] args) {
		int x[]=new int[5];
		x[0]=90;
		x[1]=80;
		x[2]=70;
		GrowableArray arr=new GrowableArray(3,x);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(40);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(40);
		arr.add(10);
		
		arr.printArr();
		
	}

	public void add(int val)
	{
		if(count==arr.length)
		{
			int[] dummyArr=new int[count*2];
			for(int i=0;i<arr.length;i++)
			{
				dummyArr[i]=arr[i];
			}
			arr=dummyArr;
		}
		arr[count++]=val;
	}
	
	public void printArr(){
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
}
