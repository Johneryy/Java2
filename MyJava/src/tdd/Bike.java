package tdd;

public class Bike {
    private boolean powerButton = false;
    private int Speed;
private int Gear;
    public void setSwitch() { powerButton = !powerButton;
    }

    public void accelerate() {
        if (powerButton) {
            //int speed;
            if (Speed >= 0 && Speed < 20) {
                Speed = Speed + 1;
                Gear = 1;
            }
        }
    }

    public int getSpeed() { return Speed;
    }
}

