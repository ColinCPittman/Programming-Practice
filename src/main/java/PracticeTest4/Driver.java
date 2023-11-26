package PracticeTest4;

public class Driver {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[5];

        for (int i = 0; i < shapeArray.length; i++) {
            if(Math.random() * 10 > 5) {
                shapeArray[i] = new Circle();

            }else {shapeArray[i] = new Square();
        }
        }

        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i].draw();
        }

        //Question 2 next

        Animal[] animals = new Animal[5];
        for (int i = 0; i < animals.length; i++) {
            if(Math.random()*10 > 5) animals[i] = new Dog();
            else animals[i] = new Cat();
        }

        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Dog) {
                Dog newDog = (Dog) animals[i];
                newDog.makeSound();
            }
            else {
                Cat newCat = (Cat) animals[i];
                newCat.makeSound();
            }
        }
    }
}
