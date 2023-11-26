package PracticeTest2;

public class ElectricCar extends Car {
    float batteryLevel;
    public ElectricCar() {
        super();
        batteryLevel = 0.0f;
    }
    public ElectricCar(String color, float speed, float batteryLevel){
        super(color, speed);
        this.batteryLevel = batteryLevel;
    }
    public void charge() {
        this.batteryLevel = Math.min(100,batteryLevel + 1.0f);
    }
    public void charge(float amount) {
        this.batteryLevel = Math.min(100, batteryLevel + amount);
    }

}
