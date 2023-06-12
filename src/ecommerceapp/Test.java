package ecommerceapp;

/**
 *
 * @author ucaro
 */
public class Test {

    public static void main(String[] args) {
        User u1 = new User("ozgurucr", "Ozgur", "Ucar", 
                "05.09.2002", "ozgur123", "ozgur.ucar@gmail.com", "adres");
        
        User u2 = new User("elon_musk", "Elon", "Musk", 
                
                "19.05,1972", "elon123", "elon.musk@gmail.com", "adres2");
        
        CreditCard c1 = new CreditCard("5165184169121", u1, "789", "09/29");
        
        CreditCard c2 = new CreditCard("1234567879", u2, "153", "04/28");
        
        Product p1 = new Product("HP Victus Laptop", "Black", 
                "Computer", 1500, 2, "2023 model new laptop ryzen 7 6800h and rtx3050ti");
        
        Product p2 = new Product("Logitech G Pro Wireless", "White", 
                "Mouse", 1000, 0.25, "Wireles Mouse");

        u1.makeOrder(p1, 0, 2000);
        u1.makeOrder(p2, 0, 100);
        u1.makeOrder(p2, 0, 75);
        u2.makeOrder(p1, 0, 50);

        u1.addFavouriteProduct(p2);
        u1.addFavouriteProduct(p1);
        u1.writeFavouriteProductList();
        u1.deleteFavouriteProduct(0);
        u1.writeFavouriteProductList();
        
        u1.writeOrderList();
        u2.writeOrderList();
        
        u1.findMostOrderedProduct();

    }
}
