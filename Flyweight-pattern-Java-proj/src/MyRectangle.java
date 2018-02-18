import java.awt.*;

//Intrinsic State: Color
//Extrinsic State: X & Y Values

public class MyRectangle {

	private Color color = Color.black;

	public MyRectangle(Color color) {

		this.color = color;

	}

	public void draw(Graphics g, int upperX, int upperY, int lowerX, int lowerY) {
		g.setColor(color);
		g.fillRect(upperX, upperY, lowerX, lowerY);
	}

}
