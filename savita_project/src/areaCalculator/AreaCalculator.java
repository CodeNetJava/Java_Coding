package areaCalculator;

public class AreaCalculator {

	public static void main(String[] args) {
		float area = (float) Area(5.0);
		System.out.println(area);
		area = (float)  Area(5.0 , 4.0);
		System.out.println(area);

	}
	
	public static double Area (double radious) {
		if ( radious < 0)
		{
			return -1.0;
		}
		else
		{
		    double area = Math.PI * radious * radious;
		    return area;
		}
	}
	
	public static double Area (double side1 , double side2) {
		if(side1 < 0 || side2 < 0)
		{
			return -1.0;
		}
		else
		{
			double area = side1 * side2 ;
			return area;
		}
	}

}
