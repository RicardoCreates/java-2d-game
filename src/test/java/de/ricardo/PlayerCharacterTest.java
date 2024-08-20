package de.ricardo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCharacterTest {

    @Test
    public void testGetX() {
        PlayerCharacter player = new PlayerCharacter();
        assertEquals(0, player.getX());
    }

    @Test
    public void testGetY() {
        PlayerCharacter player = new PlayerCharacter();
        assertEquals(0, player.getY());
    }

}