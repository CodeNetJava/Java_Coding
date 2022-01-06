package enum_in_java;

public class EnumRunner {
	
	enum Season{
		SUMMER(77), WINTER(55), RAINY(66);
		int num;
		Season(int num){        //constructor
			this.num = num;
		}
		public int getNum() {
			return num;
		}
		
		//0,1,2 Indexing
	}

	public static void main(String[] args) {
		Season season = Season.SUMMER;
		//Season season = Season.summer;  // does not allow data other than enum created data
		
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(Season.RAINY.ordinal()); // ordinal() gives the order
		System.out.println(season.RAINY.getNum()); 

	}

}


//C:\Program Files\Java\jdk-17.0.1\
