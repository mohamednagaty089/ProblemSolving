import java.util.ArrayList;

public class Testing {
public static void main(String args[]) {
	PrimeNumber primenumber=new PrimeNumber();
	
	System.out.println(primenumber.checkPrimeNumber(89));
	 
	ArrayList<Integer> prime=primenumber.getPrimeNumberInRange(10,100);
	for(int item : prime) {
		System.out.println(item);
	}
	
}
}
