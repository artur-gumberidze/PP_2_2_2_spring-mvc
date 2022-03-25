package web.model;

public class Car {
    private int speed;
    private String model;
    private double volume;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Car(int speed, String model, double volume) {
        this.speed = speed;
        this.model = model;
        this.volume = volume;
    }
}
