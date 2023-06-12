package ecommerceapp;

public class CreditCard {

    public String creditCardNumber;
    public User cardOwner;
    public String securityCode;
    public String expirationDate;

    public CreditCard(String creditCardNumber, User cardOwner, String securityCode, String expirationDate) {
        this.creditCardNumber = creditCardNumber;
        this.cardOwner = cardOwner;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
        cardOwner.addCreditCard(this);
        printAllAtts();
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public User getCardOwner() {
        return cardOwner;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setCardOwner(User cardOwner) {
        this.cardOwner = cardOwner;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void printAllAtts() {
        System.out.println("");
        System.out.println("***************");
        System.out.println("Card Owner: " + this.cardOwner.getName() + " " + this.cardOwner.getSurname());
        System.out.println("Card Number : " + this.creditCardNumber);
        System.out.println("Expiration date : " + this.expirationDate);
        System.out.println("*****************");
        System.out.println("");
    }

}
