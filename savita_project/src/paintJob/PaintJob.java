package paintJob;

public class PaintJob {
	
	public static int getBucketCount( double width, double height, double areaPerBucket, int extraBuckets)
	{
		int x = 0;
		if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
		{
			return -1;
		}
		else
		{
			double area = width * height;
			double bucketNeed = area / areaPerBucket;
			double NoOfBuckets = bucketNeed - extraBuckets;
			x = (int) Math.ceil(NoOfBuckets);
			return x;
		}
	}
	
	public static int getBucketCount( double width, double height, double areaPerBucket)
	{
		int x = 0;
		if(width <= 0 || height <= 0 || areaPerBucket <= 0 )
		{
			return -1;
		}
		else
		{
			double area = width * height;
			double bucketNeed = area / areaPerBucket;
			x = (int) Math.ceil(bucketNeed);
			return x;
		}
		
	}
	
	public static int getBucketCount( double area, double areaPerBucket)
	{
		if(area <= 0 || areaPerBucket <= 0 )
		{
			return -1;
		}
		else
		{
		int x = 0;
		double bucketNeed = area / areaPerBucket;
		x = (int) Math.ceil(bucketNeed);
		return x;
		}
	}

}
