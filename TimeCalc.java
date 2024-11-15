public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]); 

        // System.out.println(hours);
        // System.out.println(minutes);
        // System.out.println(minutesToAdd);

        int totalMinutes = (hours*60) + minutes + minutesToAdd; 
        int totalHours = totalMinutes/60; 
        int newHours = totalHours%24; 
        int newMin = totalMinutes - (totalHours*60); 

        String printHours = "" + newHours;
        String printMin = "" + newMin;

        if(newHours < 10){
            printHours = "0" + newHours; 
        }
        if(newMin < 10){
            printMin = "0" + newMin; 
        }

        System.out.println(printHours + ":" + printMin);
    }
}
