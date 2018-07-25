package homework03;

public class LoopFor {
	/**
	 * Выводит число k n раз
	 * 
	 * @param k
	 *            число;
	 * @param n
	 *            раз;
	 */
	public static void for1(int k, int n) {

		for (int i = 0; i < n; i++) {
			System.out.println(k);
		}
	}

	/**
	 * количество целых меджу двумя целыми
	 * 
	 * @param a
	 * @param b
	 */
	public static void for2(int a, int b) {
		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.println(i);
			}
			System.out.println("количество целых = " + (++b - a));
		}
	}

	public static void for3(int a, int b) {
		if (a < b) {
			for (int i = (b - 1); i > a; i--) {
				System.out.println(i);
			}
			System.out.println("количество целых = " + (b - a));
		}
	}

	/**
	 * Price for sweets
	 * 
	 * @param p
	 *            : price for 1 kg;
	 */
	public static void for4(double p) {
		if (p > 0) {
			for (int i = 1; i <= 10; i++) {
				System.out.println("Price for" + i + "kg = " + (p * i));
			}
		}
	}

	public static void for5(double p) {
		if (p > 0.0) {
			double k = 0.1;
			for (double i = 0.1; i <= 1.0; i = i + k) {
				System.out.println("price for" + i + "kg will be " + (p * i));
			}
		}
	}
/**
 	* Найти сумму  1 + 1/2 + 1/3 + … + 1/N 
 * @param n 
 * @return res 
 */
	public static double for10(int n) {
		if (n > 0);
		{
			double res=0;
					for (double i = 1; i <= n; i++) {
						res=res+(1/i);
						if(i==n) {
							System.out.println(res);}
					}
					return res;
		}		
	}
	
	public static int for11(int n) {

		if (n > 0);
		{
			int res=0;
					for (int i = 0; i <= n; i++) {
						res=res+(int)(Math.pow(i+n, 2));
						if(i==n) {
							System.out.println(res);}
					}
					return res;
		}	
	}
	public static double for12(int n) {

		if (n > 0);
		{
			double k=1;
			double res=1;
					for (int i = 1; i <= n; i++) {
						k=k+0.1;
						res=res*k;
							if(i==n) {
							System.out.println(res);}
					}
					return res;
		}	
	}
	/*For13°. Дано целое число N (> 0). Найти значение выражения
		 1.1 – 1.2 + 1.3 – … (N слагаемых, знаки чередуются).
		 Условный оператор не использовать.*/
	public static double for13(int n) {

		double sum = 0;

		for (int i = 1; i <= n; i = i + 2) {
			sum = sum + (1 + (0.1 * i));
		}
		for (int i = 2; i <= n; i = i + 2) {
			sum = sum - (1 + (0.1 * i));
		}
		return sum;
	}
		

	// -----------------------------------------------MAIN----------------------------------------------------->>>>>>
	public static void main(String[] args) {
		// LoopFor.for1(13,10);
		// LoopFor.for2(14,43);
		// LoopFor.for3(14,43);
		// LoopFor.for4(3.123);
		//LoopFor.for5(3.4);
		System.out.println(LoopFor.for13(7));
	}
}
