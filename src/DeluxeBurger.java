public class DeluxeBurger extends Hamburger {
    private boolean cips;
    private boolean drink;

    public DeluxeBurger() {
        super("Deluxe Burger", "Beef", 19.1, "Double Sandwich");
        this.cips = true;
        this.drink = true;
    }


    @Override
    public void addHamburgerAddition1(String additionName, double additionPrice) {
        System.out.println("Can not add extra ingredients to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition2(String additionName, double additionPrice) {
        System.out.println("Can not add extra ingredients to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition3(String additionName, double additionPrice) {
        System.out.println("Can not add extra ingredients to Deluxe Burger");
    }

    @Override
    public void addHamburgerAddition4(String additionName, double additionPrice) {
        System.out.println("Can not add extra ingredients to Deluxe Burger");
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }

}
