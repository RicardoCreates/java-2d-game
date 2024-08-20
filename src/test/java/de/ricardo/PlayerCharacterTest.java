package de.ricardo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    public void testGetX() {
        assertEquals(0, PlayerCharacter.getX());
    }

    @Test
    public void testGetY() {
        assertEquals(0, PlayerCharacter.getY());
    }

    @Test
    public void testMoveUp() {
        PlayerCharacter.move("W");
        assertEquals(1, PlayerCharacter.getY());
        PlayerCharacter.reset();
    }

    @Test
    public void testMoveDown() {
        PlayerCharacter.move("S");
        assertEquals(-1, PlayerCharacter.getY());
        PlayerCharacter.reset();
    }

    @Test
    public void testMoveRight() {
        PlayerCharacter.move("D");
        assertEquals(1, PlayerCharacter.getX());
        PlayerCharacter.reset();
    }

    @Test
    public void testMoveLeft() {
        PlayerCharacter.move("A");
        assertEquals(-1, PlayerCharacter.getX());
        PlayerCharacter.reset();
    }

}