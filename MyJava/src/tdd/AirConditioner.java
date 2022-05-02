package tdd;

public class AirConditioner {
    private boolean powerButton = false;
    private int Temperature = 16;

    public void setSwitch() {
        powerButton = !powerButton;
    }

    public void increaseTemperature() {
        if (powerButton) {
            if (Temperature < 30) {
                Temperature = Temperature + 1;
            } else {
                System.out.println("Temperature cannot exceed 30. ");
            }
        }
    }

    public int getTemperature() {
        return Temperature;
    }

    public void decreaseTemperature() {
        if (powerButton) {
            if (Temperature > 16) {
                Temperature = Temperature + 1;
            } else {
                System.out.println("Temperature cannot go below 16.");
            }
        }
    }
}