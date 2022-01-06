package point;

public class Point {

	private int x;
	private int y;
	
	public Point()
	{
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
	
	public double distance ()
	{
		double x1 = 0 ;
		double y1 = 0 ;
		
		double d =(double) Math.sqrt((x1- this.x)*(x1- this.x)+(y1 - this.y)*(y1 - this.y));
		return d;
	}
	
	public double distance (int x1, int y1)
	{
		double d = (double) Math.sqrt((x1- this.x)*(x1- this.x)+(y1 - this.y)*(y1 - this.y));
		return d;
	}
	
	public double distance (Point p)
	{
		double d = (double) Math.sqrt((p.x- this.x)*(p.x- this.x)+(p.y - this.y)*(p.y - this.y));
		return d;
	}
	
}
