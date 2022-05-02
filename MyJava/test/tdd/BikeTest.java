package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BikeTest {
    @Test
    public void iHaveABike() {
        Bike johnBike = new Bike();
    }

    @Test
public void johnBikeIsOn() {
    Bike johnBike = new Bike();
    johnBike.setSwitch();
    }
     @Test
    public void johnBikeIsOff() {
         Bike johnBike = new Bike();
    johnBike.setSwitch();
     }
   @Test
    public void johnBikeCanMove() {
    Bike johnBike = new Bike();
    johnBike.setSwitch();
    johnBike.accelerate();
    assertEquals(1,johnBike.getSpeed());
    }
}


