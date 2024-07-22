public class Product {
    String name;
    int count;
    int price;
    int originalPrice;
    int shippingPrice;
    private int margin;
    private int marginRate;

    public int getMargin() {
        return margin;
    }

    public void setMargin(int margin) {
        this.margin = margin;
    }

    public int getMarginRate() {
        return marginRate;
    }

    public void setMarginRate(int marginRate) {
        this.marginRate = marginRate;
    }
}
