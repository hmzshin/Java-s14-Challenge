public class HealthyHamburger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyHamburger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }


    public void addHealthyAddition1(String additionName, double additionPrice) {
        this.healthyExtra1Name = additionName;
        this.healthyExtra1Price = additionPrice;

    }

    public void addHealthyAddition2(String additionName, double additionPrice) {
        this.healthyExtra2Name = additionName;
        this.healthyExtra2Price = additionPrice;
    }

    @Override
    public double itemizeHamburger() {
        double[] prices = {super.getPrice(), super.getAddition1Price(), super.getAddition2Price(), super.getAddition3Price(), super.getAddition4Price(), healthyExtra1Price, healthyExtra2Price};
        double totalPrice = 0;
        for (double price : prices) {
            totalPrice += price;
        }
        super.setPrice(totalPrice);
        System.out.println(this);
        return totalPrice;

    }


    @Override
    public String toString() {
        String healthy1 = healthyExtra1Name == null ? "" : ", healthyAddition1=" + healthyExtra1Name;
        String healthy2 = healthyExtra2Name == null ? "" : ", healthyAddition2=" + healthyExtra2Name;
        String addition1 = super.getAddition1Name() == null ? "" : ", addition1=" + super.getAddition1Name();
        String addition2 = super.getAddition2Name() == null ? "" : ", addition2=" + super.getAddition2Name();
        String addition3 = super.getAddition3Name() == null ? "" : ", addition3=" + super.getAddition3Name();
        String addition4 = super.getAddition4Name() == null ? "" : ", addition4=" + super.getAddition4Name();

        return
                "Name='" + super.getName() +
                        ", Meat='" + super.getMeat() + '\'' +
                        ", BreadRollType=" + super.getBreadRollType() +
                        addition1 + addition2 + addition3 + addition4 + healthy1 + healthy2 + ", Price=" + super.getPrice()

                ;
    }

}
