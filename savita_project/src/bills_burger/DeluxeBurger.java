package bills_burger;

public class DeluxeBurger extends Hamburger {
	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;

	public DeluxeBurger() {
		 super("Deluxe", "Sausage & Bacon", 14.54, "White");
		 super.addHamburgerAddition1("Chips",2.47);
		 super.addHamburgerAddition2("Drink",2.09);
		 
	}
	
	@Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

}
