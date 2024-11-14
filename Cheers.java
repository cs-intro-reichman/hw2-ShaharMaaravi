// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int n = Integer.parseInt(args[1]); 
                String upper = name.toUpperCase();
                int len = upper.length(); 
                String letters = "AEFHILMNOR";

                for(int i = 0; i < len; i++){
                        System.out.print("Give me a");
                        if(letters.indexOf(upper.charAt(i)) == -1){
                               System.out.print("  " + upper.charAt(i) + ": " + upper.charAt(i) + "!");
                        }
                        else{
                                System.out.print("n " + upper.charAt(i) + ": " + upper.charAt(i) + "!");
                        }
                        System.out.println("");
                }

                System.out.println("What does that spell?");
                for(int k = 0; k < n; k++){
                        System.out.println(upper + "!!!");
                }
        }
}
