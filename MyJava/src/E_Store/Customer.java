package E_Store;

import java.util.List;

public class Customer extends User{
    private List<BillingInformation>billingInformations;
    private ShoppingCart shoppingCart;

    public List<BillingInformation> getBillingInformations() {
        return billingInformations;
    }

    public void setBillingInformations(List<BillingInformation> billingInformations) {
        this.billingInformations = billingInformations;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
