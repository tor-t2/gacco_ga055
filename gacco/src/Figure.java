import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Figure {
	private int x;
	private int y;
	private int width;
	private int height;
	private Color lineColor;
	private Color fillColor;
	public abstract void draw(Graphics g);
	private String colorToCSV(Color color) {
		return String.format("%d,%d,%d", color.getRed(),color.getGreen(),color.getBlue());
	}
	public String toCSV() {
		return this.getClass().getSimpleName()+","
				+this.getX()+","+this.getY()+","
				+this.getWidth()+","+this.getHeight()+","
				+this.colorToCSV(getLineColor())+","
				+this.colorToCSV(getFillColor());
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWH(int widht, int height) {
		this.setWidth(widht);
		this.setHeight(height);
	}
	public void setFromPoints(Point p1, Point p2) {
		int x = Math.min(p1.x, p2.x);
		int y = Math.min(p1.y, p2.y);
		int w = Math.abs(p1.x-p2.x);
		int h = Math.abs(p1.y-p2.y);
		this.setXY(x, y);
		this.setWH(w, h);
	}
	public Color getLineColor() {
		return lineColor;
	}
	public void setLineColor(Color color) {
		this.lineColor = color;
	}
	public Color getFillColor() {
		return fillColor;
	}
	public void setFillColor(Color color) {
		this.fillColor = color;
	}
	public void setColors(Color lineColor, Color fillColor) {
		this.setLineColor(lineColor);
		this.setFillColor(fillColor);
	}
}
