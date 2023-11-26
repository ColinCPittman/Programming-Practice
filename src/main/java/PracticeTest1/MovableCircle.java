package PracticeTest1;

public class MovableCircle extends Circle implements IMovable{
    int x;
    int y;
    public MovableCircle(){
        this.x =0;
        this.y =0;
    }
    public void moveUp(int distance) {
       y += distance;
    }

    public void moveDown(int distance) {
       y -= distance;
    }

    public void moveRight(int distance) {
        x += distance;
    }

    public void moveLeft(int distance) {
        x -= distance;
    }
}
