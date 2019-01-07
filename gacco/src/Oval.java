import java.awt.Graphics;

public class Oval extends Figure {

	@Override
	public void draw(Graphics g) {
		g.setColor(this.getFillColor());
		g.fillOval(getX(), getY(), getWidth(), getHeight());
		g.setColor(getLineColor());
		g.drawOval(getX(), getY(), getWidth(), getHeight());
	}

}
