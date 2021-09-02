package Les5;

public class Lesson5 {
    public static void main(String[] args) {
        Player player1 = new Player();

        player1.name = "Boris";
        player1.health = 80;
        player1.positionX = 5;
        player1.positionY = 9;
        player1.attackPoint =10;
        player1.isAlive = (player1.health > 0) ? true : false;

        System.out.println(player1.name);
        System.out.println(player1.sword.length);

        Player player2 = new Player();

        player2.name = "Dina";
        player2.health = 80;
        player2.positionX = 5;
        player2.positionY = 9;
        player2.attackPoint =10;
        player2.isAlive = true;

        System.out.println(player2.name);
        player1.speak();
    }
}
