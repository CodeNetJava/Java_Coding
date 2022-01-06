package lockInterface;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Increment {
	
	private int i = 0;
	private int j = 0 ;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	
	public void incrementI() {
		lockForI.lock();
		i++;
		lockForI.unlock();
	}
	
	public void incrementJ() {
		lockForJ.lock();
		j++;
		lockForJ.unlock();
	}
	public static void main(String[] args) {
	

	}

}
