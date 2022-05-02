package tdd;

public class Driller {
    private int price;

    public int getPrice(int copies) {
        if (copies >= 1 && copies <= 4){
            price = 2000 * copies;
        }
        if (copies >= 5 && copies <= 9){
            price = 1800 * copies;
        }
        if (copies >= 10 && copies <=29){
            price = 1600 * copies;
        }
        if (copies >=30 && copies <=49 ){
            price = 1500 * copies;
        }
        if (copies >=50 && copies <=99){
            price = 1300 * copies;
        }
        if (copies >=100 && copies <=199){
            price = 1200 * copies;
        }
        if (copies >=200 && copies <=499){
            price = 1100 * copies;
        }
        if (copies >= 500){
            price = 1000 * copies;
        }
        return price;

    }
}