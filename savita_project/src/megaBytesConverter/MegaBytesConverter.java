package megaBytesConverter;

public class MegaBytesConverter {
	
	public static void printMegaBytesAndKilobytes( int kiloBytes ) 
	{
		
		int megaByte = kiloBytes / 1024;
		int remainingKiloBytes = kiloBytes % 1024;
		System.out.println(kiloBytes + 
				" KB = "+ megaByte + " MB and "+ 
				remainingKiloBytes + " KB");	
	}
}
