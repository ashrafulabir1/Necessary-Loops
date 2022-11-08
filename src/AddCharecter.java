import java.util.Random;

public class AddCharecter {
	public static void main(String[] args) {
		 String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		    System.out.println("All Characters are: " + name);
		    // loop through each element
		    for(int i = 0; i<name.length(); i++) {
		      // access each character
		      char add = name.charAt(i);
		      System.out.println("Test "+add);
		    }
	}
}
