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
        switch (direction) {
            case "W" -> y += 1;
            case "S" -> y -= 1;
            case "D" -> x += 1;
            case "A" -> x -= 1;
        }
    }

    public static void reset() {
        x = 0;
        y = 0;
    }
}

