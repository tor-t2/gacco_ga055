import java.awt.Graphics;

public class Rect extends Figure {

	@Override
	public void draw(Graphics g) {
		g.setColor(getFillColor());
		g.fillRect(getX(), getY(), getWidth(), getHeight());
		g.setColor(getLineColor());
		g.drawRect(getX(), getY(), getWidth(), getHeight());
	}

}
