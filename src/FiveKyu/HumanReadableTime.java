package FiveKyu;

public class HumanReadableTime {
    /*
        Write a function, thich takes a non-negative integer.
        as inputs and returns the time in a human-readable format
        (HH:MM:SS)
        
    Note :
    The maximum time never exceeds 359999
    */
    public static String makeReadable(int seconds){
        //1 hour -> 3600s
        //1 min -> 60s
        if (seconds<=359999) {
            int lap = seconds/60;
            int hour = seconds/3600;
            int min = (lap % 60)%60;
            int sec = seconds%60;
            
            return String.format("%02d:%02d:%02d", hour,min,sec);
        }
        return "";
    }
}
