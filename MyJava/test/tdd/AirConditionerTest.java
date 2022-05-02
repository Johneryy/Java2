package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirConditionerTest {
    @Test
    public void iHaveAnAc() {
    }

    @Test
    public void johnAcIsOn() {
        AirConditioner johnAc = new AirConditioner();
        johnAc.setSwitch();
    }

    @Test
    public void johnAcCanIncreaseTemp() {
        AirConditioner johnAc = new AirConditioner();
        johnAc.setSwitch();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        assertEquals(19, johnAc.getTemperature());
    }

    @Test
    public void johnAcCanBeDecreased() {
        AirConditioner johnAc = new AirConditioner();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.decreaseTemperature();
        johnAc.decreaseTemperature();
        johnAc.decreaseTemperature();
        johnAc.decreaseTemperature();
        assertEquals(16, johnAc.getTemperature());
    }
    @Test
    public void increaseTemperatureBeyond30Test() {
        AirConditioner johnAc = new AirConditioner();
        johnAc.setSwitch();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        johnAc.increaseTemperature();
        assertEquals(30, johnAc.getTemperature());


    }
    @Test
    public void decreaseTemperatureBelow16(){
        AirConditioner johnAc = new AirConditioner();
        johnAc.setSwitch();

        johnAc.decreaseTemperature();
        assertEquals(16, johnAc.getTemperature());
    }
}
