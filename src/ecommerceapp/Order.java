package ecommerceapp;

public class Order {

    private Product orderedProduct;
    private CreditCard usedCreditCard;
    private double amount;

    public Order(Product orderedProduct, CreditCard usedCreditCard, double amount) {
        this.orderedProduct = orderedProduct;
        this.usedCreditCard = usedCreditCard;
        this.amount = amount;
    }

    public void makeOrder() {
        System.out.println("Order confirmed!");
        this.orderedProduct.reduceStock(amount);

    }

    public void printOrder() {
        System.out.println("Ordered Product : " + this.orderedProduct.getProductName() + "  Amount: " + this.amount + "  Ordered Credit Card: " + this.usedCreditCard.getCreditCardNumber());
    }
}
