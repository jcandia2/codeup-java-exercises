package products;

public class Product {
protected String type;
protected String productNumber;
protected double price;
protected int qtyOnHand;

    public Product() {
    }

    public Product(String type, String productNumber, double price, int qtyOnHand) {
        this.type = type;
        this.productNumber = productNumber;
        this.price = price;
        this.qtyOnHand = qtyOnHand;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
}


