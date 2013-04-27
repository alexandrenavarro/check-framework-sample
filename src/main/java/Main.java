import checkers.nullness.quals.NonNull;



/**
 * <p>Main. </p>
 *
 * @author anavarro - Apr 24, 2013
 *
 */
public class Main {

    /**
     * main.
     *
     * @param args
     */
    public static void main(String[] args) {
        @NonNull 
        Object myObject = new Object();
        
        System.out.println(myObject.toString());

    }

}
