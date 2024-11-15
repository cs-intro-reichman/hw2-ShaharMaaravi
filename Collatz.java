// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n = Integer.parseInt(args[0]); 
		char mode = args[1].charAt(0);
		int counter = 0;
		int current = n; 
		

		for(int i = 1; i <= n; i++) {
			current = i;
			counter = 1;
			if(current == 1 & mode == 'v'){
				System.out.print(current + ", ");
				if(current%2 == 0){ 
					current = current/2; 
					counter++;
				}
				else{
					current = current*3 + 1; 
					counter++;
				}
			}
			while(current > 1){
				if(mode == 'v'){
					System.out.print(current + ", ");
				}
				if(current%2 == 0){ 
					current = current/2; 
					counter++;
				}
				else{
					current = current*3 + 1; 
					counter++;
				}
			}
			if(mode == 'v'){
				System.out.print(current + " (" + counter + ")");
				System.out.println("");
			}
		}
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
	}
}
