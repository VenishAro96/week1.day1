package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
/*
 * 0 1 1 2 3 5 8 ....
 */
 int f1 = 0;
 int f2 = 1;
 int sum = 0;
 int n = 9;
 System.out.println(f1);
 System.out.println(f2);
 
 for (int i = 1; i <=n; i++) {
	 sum = f1+f2;
	 f1 =f2;
	 f2 = sum;
	 System.out.println(sum);
	
}
		
	}

}
