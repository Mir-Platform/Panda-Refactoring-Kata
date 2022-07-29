package ru.starMir.pandaRefactoringKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RedPandaShould {

    @Test
    public void haveSpeedAs0WhenItIsSleeping() {
        final var panda = new RedPanda(3, true);

        assertEquals(0.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs12WhenItIsNotSleepingAndHasEaten1Bamboos() {
        final var panda = new RedPanda(1, false);

        assertEquals(12.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs24WhenItIsNotSleepingAndHasEaten4Bamboos() {
        final var panda = new RedPanda(4, false);

        assertEquals(24.0, panda.getSpeed(), 0.0);
    }
}
