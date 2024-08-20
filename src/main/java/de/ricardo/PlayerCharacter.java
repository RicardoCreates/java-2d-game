package de.ricardo;

public class PlayerCharacter {
    private static int x = 0;
    private static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(String direction) {
        if (direction.equals("W")) {
            y += 1;
        }
    }
}

