package pattern.bridge;

import java.util.Scanner;

public class BridgePattern {
	
	static Color color;
    public static void main (String args[]) throws Exception{
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("What color would you like?");
		System.out.println("Red \t or blue");
		setColor(scan.next());
    	
    	System.out.println("What size are you?");
		System.out.println("Input S for small \t M for medium \t L for large");
		
		setSize(scan.next().charAt(0));
}

    public static TShirtSize setSize(char c) {
    	TShirtSize s = null;    	
    	switch(c) {
    	case 's':
    	case 'S':
    		s = new Small(color);
    		break;
    	case 'm':
    	case 'M':
    		s = new Medium(color);
    		break;
    	case 'l':
    	case 'L':
    		s = new Large(color);
    		break;
    	
    	}
    	return s; 
    }
    public static void setColor(String s) {
    	Color c = null;
    	s = s.toLowerCase();
    	
    	switch(s) {
    	case "red":
    		color = new Red();
    		break;
    	case "blue":
    		color = new Blue();
    		break;
    	
    	}
    }

}
