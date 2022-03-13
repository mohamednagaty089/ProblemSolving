import java.util.ArrayList;

public class PrimeNumber {

public boolean checkPrimeNumber(int number) {
	byte flag=0;
	int halfnumber=number/2;
	for(int i=2;i<=halfnumber;i++) {
		if(number%i==0) {
			flag=1;
			break;
		}
	}
	return flag==0?true:false;
}
public ArrayList<Integer> getPrimeNumberInRange(int startnumber,int endnumber) {
	ArrayList<Integer> prime=new ArrayList<Integer>();
    boolean flag;
	int halfnumber;
	for(int i=startnumber;i<=endnumber;i++) {
	     flag=checkPrimeNumber(i);
		if(flag==true) {
			prime.add(i);
		}
		flag=false;
	}
	return prime;
}

	
}
