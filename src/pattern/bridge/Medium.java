package pattern.bridge;

public class Medium extends TShirtSize {
	char size;
	Medium(Color color) {
		super(color);
		size = 'M';
		System.out.println("Congratulations on your selection!");
		System.out.println("Size selection: " + size);
		color.shirtColor();
	}

}
