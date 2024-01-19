public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void addHamburgerAddition1(String additionName, double additionPrice) {
        this.addition1Name = additionName;
        this.addition1Price = additionPrice;
    }

    public void addHamburgerAddition2(String additionName, double additionPrice) {
        this.addition2Name = additionName;
        this.addition2Price = additionPrice;
    }

    public void addHamburgerAddition3(String additionName, double additionPrice) {
        this.addition3Name = additionName;
        this.addition3Price = additionPrice;
    }

    public void addHamburgerAddition4(String additionName, double additionPrice) {
        this.addition4Name = additionName;
        this.addition4Price = additionPrice;
    }


    public double itemizeHamburger() {

        double[] prices = {price, addition1Price, addition2Price, addition3Price, addition4Price};
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        this.setPrice(totalPrice);
        System.out.println(this);
        return totalPrice;
    }

    @Override
    public String toString() {
        String addition1 = addition1Name == null ? "" : ", addition1=" + addition1Name;
        String addition2 = addition2Name == null ? "" : ", addition2=" + addition2Name;
        String addition3 = addition3Name == null ? "" : ", addition3=" + addition3Name;
        String addition4 = addition4Name == null ? "" : ", addition4=" + addition4Name;
        return
                "Name='" + name +
                        ", Meat='" + meat + '\'' +
                        ", BreadRollType=" + breadRollType +
                        addition1 + addition2 + addition3 + addition4 + ", Price=" + price

                ;
    }
}
