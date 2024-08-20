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
    }

}