package PracticeTest2;

public class Car {
    float speed;
    String color;

    public Car() {
        this.speed = 0.0f;
        this.color = "UNKNOWN";
    }

    public Car(String color, float speed) {
        this.speed = speed;
        this.color = color;
    }
    public void accelerate(float amount) {
        this.speed += amount;
    }
    public void accelerate() {
        this.speed += 1.0f;
    }
    public void decelerate(float amount) {
        this.speed = Math.max(0, this.speed - amount);
    }
    public void decelerate() {
        this.speed = Math.max(0,this.speed - 1.0f);
    }
}
