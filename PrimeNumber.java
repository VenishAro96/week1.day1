package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
int num= 729;
int n =0;
for (int i = 2; i <=num-1 ; i++) {
	if(num%i==0)
		n=n+1;
	
}
if(n>0)
	System.out.println("not prime");
else
	System.out.println("prime");
	}

}
