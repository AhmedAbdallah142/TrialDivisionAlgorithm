import java.util.ArrayList;
import java.util.Arrays;

public class TrialDivisionAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private ArrayList<Integer> TrialDivision(int num) {
		SieveAlgorithm((int) Math.floor(Math.sqrt(num)));
		
		return null;
	}
	
	private ArrayList<Integer> SieveAlgorithm(int num) {
		ArrayList<Integer> primeNums = new ArrayList<Integer>();
		boolean[] primeCheck = new boolean[num+1];
		Arrays.fill(primeCheck, true);
		for (int p = 2 ; p*p<num ; p++) {
			if (primeCheck[p]) {
				for (int i = p*p ;i<=num;i+=p) {
					primeCheck[i] = false;
				}
			}
		}
		
		for (int p=2; p<=num; p++) {
			if (primeCheck[p]) {
				primeNums.add(p);
			}
		}
	    
		return primeNums;
	}

}
