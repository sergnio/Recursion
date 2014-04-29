
public class RecursiveGraphics {
	public static void mysteryImage(double x, double y, double side, int level) {
		if (level == 0) {
			StdDraw.filledSquare(x, y, side);
		} else {
			// Add the necessary code in the class 
			// I have provided so that
			// it will create the fractals pictured below
			// for levels 0, 1, and 2
			mysteryImage(x, y, side * .5, level - 1);
			mysteryImage(x - side * 0.75, y - side * 0.75, side * 0.25, level - 1);
			mysteryImage(x + side * 0.75, y - side * 0.75, side * 0.25, level - 1);
			mysteryImage(x - side * 0.75, y + side * 0.75, side * 0.25, level - 1);
			mysteryImage(x + side * 0.75, y + side * 0.75, side * 0.25, level - 1);
		}
	}
	public static void main(String[] args) {
		int level = 0;
		mysteryImage(.5, .5, .5, level); 
	}
}
