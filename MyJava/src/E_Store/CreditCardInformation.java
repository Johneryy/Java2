package E_Store;

public class CreditCardInformation {
    private String cvv;
    private String expirationYearAndMonth;
    private String creditCardNumber;
    private String nameOnCard;
    private CardType cardType;

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getExpirationYearAndMonth() {
        return expirationYearAndMonth;
    }

    public void setExpirationYearAndMonth(String expirationYearAndMonth) {
        this.expirationYearAndMonth = expirationYearAndMonth;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
