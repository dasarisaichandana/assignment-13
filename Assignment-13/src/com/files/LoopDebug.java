package com.files;

import java.util.Scanner;

public class LoopDebug {
	Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		LoopDebug l=new LoopDebug();
		l.running();

	}
	public void running() 
	{
		System.out.println("enter values of n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(i);
		}
	}

}
