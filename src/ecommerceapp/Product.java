package ecommerceapp;

import java.util.ArrayList;

public class Product {

    public String productName;
    public String color;
    public String category;
    public long stockInformation;
    public double weight;
    public String productDescription;
    private ArrayList<Product> productList;
    private int orderCounter = 0;

    public Product(String productName, String color, String category, long stockInformation, double weight, String productDescription) {
        this.productName = productName;
        this.color = color;
        this.category = category;
        this.stockInformation = stockInformation;
        this.weight = weight;
        this.productDescription = productDescription;
        this.productList = new ArrayList<Product>();

        printAllAtts();
    }

    public String getProductName() {
        return productName;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public double getStockInformation() {
        return stockInformation;
    }

    public double getWeight() {
        return weight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOrderCounter() {
        return orderCounter;
    }

    public void setOrderCounter(int orderCounter) {
        this.orderCounter = orderCounter;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setStockInformation(long stockInformation) {
        this.stockInformation = stockInformation;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public boolean stockCheck(double amount) {
        if (amount <= this.getStockInformation()) {
            return true;
        } else {
            System.out.println("");
            System.out.println("**********************");
            System.out.println("No Enough Stock Amount");
            System.out.println("**********************");
            System.out.println("");
            return false;
        }
    }

    public void reduceStock(double amount) {
        if (this.stockCheck(amount)) {
            this.stockInformation -= amount;
            printAllAtts();
        }
    }

    public void printAllAtts() {
        System.out.println("");
        System.out.println("**************************");
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product Color: " + this.color);
        System.out.println("Category: " + this.category);
        System.out.println("Weight: " + this.weight + " kg");
        System.out.println("Stock: " + this.stockInformation);
        System.out.println("***************************");
        System.out.println("");

    }

}
