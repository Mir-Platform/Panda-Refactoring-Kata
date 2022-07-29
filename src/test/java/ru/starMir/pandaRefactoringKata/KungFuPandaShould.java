package ru.starMir.pandaRefactoringKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KungFuPandaShould {

    @Test
    public void haveSpeedAs10WhenItHas1Dan() {
        final var panda = new KungFuPanda(1);
        assertEquals(10.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs8WhenItHas2Dan() {
        final var panda = new KungFuPanda(2);

        assertEquals(8.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs6WhenItHas3Dan() {
        final var panda = new KungFuPanda(3);

        assertEquals(6.0, panda.getSpeed(), 0.0);
    }

}
