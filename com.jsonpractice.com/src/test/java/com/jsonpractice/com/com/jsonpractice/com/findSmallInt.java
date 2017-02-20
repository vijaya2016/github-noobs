package com.jsonpractice.com.com.jsonpractice.com;

public class findSmallInt {
public static void main(String args[])
{
	int a[] = {1,7,4,2};
	//System.out.println(a);
	for(int i =0;i<a.length;i++)
	{
		for(int j = 0;j<a.length-1;j++)
		{
			if(a[j]>a[j+1])
			{
				int t = a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
//for(int k=0;k<a.length;k++)
//System.out.println(a[k]);
	//{1,2,4,7}
for(int m=0;m<a.length;m++)
{
	//System.out.println(a[m+1]);
	//System.out.println(a[m]);
	//System.out.println((a[m+1]-a[m]));
	if((a[m+1]-a[m])>1)
	{
		
//	System.out.println((a[m+1]-a[m]));
		System.out.println(a[m]+1);
	
	break;
	}
}
}
}
;