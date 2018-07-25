package project03;

import java.util.Scanner;

public class MyLib {
	public static void Task1() {
		{
			int i = 1;
			while (i <= 8) {
				System.out.println(i);
				if (i == 5)
					break;
				i++;
			}
		}

	}

	public static void Task2() {
		for (int i = 1; i <= 8 && i != 100; i = i - 2) {
			if (i == 3)
				continue;
			System.out.println(i);
		}
	}

	public static void menu() {
		String x = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter var task (1-2)");
			System.out.println("1. Task1");
			System.out.println("2. Task2");
			String answer = sc.nextLine();
			switch (answer) {
			case "1":
				Task1();
				break;
			case "2":
				Task2();
				break;
			default:
				System.out.println(" wrong var task");
				break;
			}
			System.out.println("do you want exit [y]");
			x = sc.nextLine();
			System.out.println(x);
		} while (!x.equals("y"));

	}
	
	public static int myFact(int n) {
		int fact=1;
		for (int i = 2; i <= n; i++) {
			fact = i*fact;
			System.out.println(fact);
		}
		return fact;
	}
	public static int myPow(int x,int n) {
		int xp=1;
		for (int i = 1; i <= n; i++) {
			xp = x*xp;
		//	System.out.println(xp);
		}
		return xp;
	}
	// n!=n*(n-1)!
	public static int recFact(int n) {
		if(n<=1) return 1;
		return n*recFact(n-1);
	}
	// fib(n)=fib(n-1)+fib(n-2)
	public static int fib(int n) {
		if(n==1||n==0) return 1;
		System.out.println(n);
		return fib(n-1)+fib(n-2);
	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int fibF(int n) {
		if(n==1||n==0) return 1;
		int z=0,y=1,x=1;
		for (int i = 2; i <= n; i++) {
			z=y+x;
			x=y;
			y=z;
			System.out.println(i);
		}
		return z;
	}
//	public static double myAverage() {
		
//	}
    /**
     * метод который выводит на екран значения от х с шагом dx 
     * n раз значения
     * @param x - начальное значение
     * @param dx - шаг изменения
     * @param n - количество раз
     */
    public static void printNegative(int x,int dx, int n) {	
    	
    	for (int i = 0; i < n; i++) {
    		x=x-dx;
			System.out.println(x);
		}
	}
}
