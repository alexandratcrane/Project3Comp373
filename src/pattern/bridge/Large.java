package pattern.bridge;

public class Large extends TShirtSize {
	char size;
	Large(Color color) {
		super(color);
		size = 'L';
		System.out.println("Congratulations on your selection!");
		System.out.println("Size selection: " + size);
		color.shirtColor();
		
	}
	
}
