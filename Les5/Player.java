package Les5;

public class Player {

    String name;
    int health;
    int positionX;
    int positionY;
    int attackPoint;
    boolean isAlive;
    Sword sword = new Sword();
    Coordinates coordinates = new Coordinates();

    void speak() {
        System.out.println(("Hello! My name is " + name));
    }

    void changePosition(){
        coordinates.x += 1;
        coordinates.y -= 1;
//        positionX += 1;
//        positionY -= 1;
        System.out.println("My next position is [" + positionX + ":" + positionY + "]");
    }

    void takeDamage(int valueDamage) {
        health -= valueDamage;
        System.out.println(name + " has take damage is " +valueDamage + ". Player HP = " + health);
    }

    class Sword{
        String name;
        int length = 100;
        float weight;
    }
}
