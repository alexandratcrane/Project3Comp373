package pattern.bridge;

public class Small extends TShirtSize {
	char size;
	//Color color;
	Small(Color color){
		super(color);
		size = 'S';
		System.out.println("Congratulations on your selection!");
		System.out.println("Size selection: " + size);
		color.shirtColor();		
	}
}
