
// This factory only creates a new rectangle if it 
// uses a color not previously used

import java.util.HashMap;
import java.awt.Color;

public class RectangleFactory {

	// The HashMap uses the color as the key for every
	// rectangle it will make up to 8 total

	private static final HashMap<Color, MyRectangle> rectsByColor = new HashMap<Color, MyRectangle>();

	public static MyRectangle getRect(Color color) {
		MyRectangle rect = rectsByColor.get(color);

		// Checks if a rectangle with a specific
		// color has been made. If not it makes a
		// new one, otherwise it returns one made already

		if (rect == null) {
			rect = new MyRectangle(color);

			// Add new rectangle to HashMap

			rectsByColor.put(color, rect);

		}
		return rect;
	}
}
