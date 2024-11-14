// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int n = Integer.parseInt(args[0]); 
		double sumPi = 0; 
		double m = 1;
		int k = 1;
		for(int i = 0; i <= n; i++){
			if(k == 1){
				sumPi = sumPi + (1/m); 
			}
			else{
				sumPi = sumPi - (1/m); 
			}
			m = m + 2;
			k = k*-1;
		}
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated: " + sumPi*4);
	}
}
