package ecommerceapp;

import java.util.ArrayList;

public class User {

    private String username;
    private String name;
    private String surname;
    private String dateofbirth;
    private String password;
    private String email;
    private String adress;
    private ArrayList<CreditCard> creditCardList;
    private ArrayList<Order> orderList;
    private ArrayList<Product> orderedProducts;
    private ArrayList<Product> favouriteProductList;

    public User(String username, String name, String surname, String dateofbirth, String password, String email, String adress) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateofbirth = dateofbirth;
        this.password = password;
        this.email = email;
        this.adress = adress;
        this.creditCardList = new ArrayList<CreditCard>();
        this.orderList = new ArrayList<Order>();
        this.orderedProducts = new ArrayList<Product>();
        this.favouriteProductList = new ArrayList<Product>();
        printAllAtts();

    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void addCreditCard(CreditCard c) {
        this.creditCardList.add(c);
    }

    public CreditCard getCreditCardByIndex(int index) {
        return this.creditCardList.get(index);
    }

    public Order getOrderByIndex(int index) {
        return this.orderList.get(index);
    }
    
    public Product getOrderedProductByIndex(int index) {
        return this.orderedProducts.get(index);
    }
    
    public Product getFavouriteProductByIndex(int index) {
        return this.favouriteProductList.get(index);
    }
        
    public void addOrderedProduct(Product p) {
        this.orderedProducts.add(p);
    }

    public void addOrder(Order o) {
        this.orderList.add(o);
    }
    
    public void addFavouriteProduct(Product p) {
        this.favouriteProductList.add(p);
    }

    public void deleteFavouriteProduct(int index) {
        this.favouriteProductList.remove(index);
    }

    public void makeOrder(Product product, int creditCardIndex, double amount) {
        if (product.stockCheck(amount)) {
            Order o1 = new Order(product, this.getCreditCardByIndex(creditCardIndex), amount);
            o1.makeOrder();
            this.addOrder(o1);
            this.addOrderedProduct(product);
        }
    }

    public void findMostOrderedProduct() {
        int indexofmax = 0;
        int max = this.getOrderedProductByIndex(0).getOrderCounter();
        for (int index = 0; index < this.orderedProducts.size(); index++) {
            this.getOrderedProductByIndex(index).setOrderCounter(this.getOrderedProductByIndex(index).getOrderCounter() + 1);
        }
        for (int index = 1; index < this.orderedProducts.size(); index++) {
            if (this.getOrderedProductByIndex(index).getOrderCounter() > max) {
                max = this.getOrderedProductByIndex(index).getOrderCounter();
                indexofmax = index;
            }
        }
        System.out.println("");
        System.out.println("************************");
        System.out.println(this.username + "'s most ordered product is : " + this.getOrderedProductByIndex(indexofmax).getProductName() + "  Ordered this product " + this.getOrderedProductByIndex(indexofmax).getOrderCounter() + " times!");
        System.out.println("************************");
        System.out.println("");
        for (int index = 0; index < this.orderedProducts.size(); index++) {
            this.getOrderedProductByIndex(index).setOrderCounter(0);
        }
    }

    public void writeOrderList() {
        System.out.println("");
        System.out.println("****************");
        System.out.println("User : " + this.username + "'s Order List:");
        System.out.println("");
        for (int index = 0; index < this.orderList.size(); index++) {
            System.out.print(index + 1 + ": ");
            getOrderByIndex(index).printOrder();
        }
        System.out.println("****************");
        System.out.println("");
    }

    public void writeFavouriteProductList() {
        System.out.println("");
        System.out.println(this.getUsername() + "'s Favourite Product List");
        System.out.println("**************************");
        for (int i = 0; i < this.favouriteProductList.size(); i++) {

            System.out.println(i + 1 + " . Favourite Product:" + this.getFavouriteProductByIndex(i).getProductName());

        }
        System.out.println("**************************");
        System.out.println("");
    }

    public void printAllAtts() {
        System.out.println("");
        System.out.println("***************");
        System.out.println("Name : " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Username: " + this.username);
        System.out.println("Mail: " + this.email);
        System.out.println("***************");
        System.out.println("");
    }

}
