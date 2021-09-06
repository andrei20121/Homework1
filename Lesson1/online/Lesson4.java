package Lesson1.online;

import java.util.Random;

public class Lesson4 {
    public static Random random = new Random();
    public static String playerName;
    public static int healthPoint;
    public static int attackPoint;
    public static int playerPositionX;
    public static int getPlayerPositionY;
    public static final int PLAYER_MOVE_UP = 8;
    public static final int PLAYER_MOVE_DOWN = 2;
    public static final int PLAYER_MOVE_LEFT = 4;
    public static final int PLAYER_MOVE_RIGHT = 6;
    public static char playerPoint = '@';

    public static char enemyPoint = 'E';
    public static int enemyHealthPoint;
    public static int enemyAttackPoint;
    public static int enemyValueMin = 20;
    public static int enemyValueMax = 30;

    public static char[][] map;
    public static char[][] invisibleMap;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapValueMin = 3;
    public static int mapValueMax = 6;


    public static void main(String[] args) {

    }
    public static void createMap(){
        mapHeight = randomValue(mapValueMin, mapValueMax);
        mapWidth = randomValue(mapValueMin, mapValueMax);
        map = new char[mapHeight][mapWidth];
        invisibleMap = new char[mapHeight][mapWidth];
    }
    public static int randomValue(int min, int max){
        return min + random.nextInt(max - min + 1);
    }
}
