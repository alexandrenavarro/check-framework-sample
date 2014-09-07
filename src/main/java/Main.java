import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;




/**
 * <p>
 * Main.
 * </p>
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
        
    	  @Nullable Object   obj;  // might be null
    	  @Nonnull  Object nnobj;  // never null

    	  //obj.toString() ;        // checker warning:  dereference might cause null pointer exception
    	  //nnobj = obj;           // checker warning:  nnobj may become null
    	  //if (nnobj == null)  {   // checker warning:  redundant test
    	  //}
    		  
        Object myObject = new Object();
        
        System.out.println(myObject.toString());

        
        final List<String> list = new ArrayList<String>();
        list.add("toto");
        
        list.forEach(t -> System.out.println(t));
        
        //String toto = length("test");
        
        String test = length("tes");
        
       // if (test != null) 
        {
        	test.length();
        }
        
        
    }

	
	public static @Nullable String length(@Nonnull String test) {
		// test.length();
		return null;
	}

}
