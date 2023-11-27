package PracticeTest5;

public class Monster implements Runnable{
    public int x_location;
    public int y_location;

    public Monster() {
        x_location = (int) (Math.random() * 101);
        y_location = (int) (Math.random() * 101);
    }
    public void run() { //i had an idea of having monsters move around a grid but I need to move over to a JavaFX project or something for this experiment
        switch ((int)(Math.random()*4)) {
            case 0: x_location = Math.min(x_location + 1, 100);
            break;
            case 1: x_location = Math.max(x_location - 1,0);
            break;
            case 2: y_location = Math.min(y_location + 1,100);
            break;
            case 3: y_location = Math.max(y_location - 1,0);
            break;
        }
    }

    public static void main(String[] args) {
        Monster m1 = new Monster();
        Monster m2 = new Monster();
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
        }
    }
}
