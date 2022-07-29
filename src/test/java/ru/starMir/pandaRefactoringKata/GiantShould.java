package ru.starMir.pandaRefactoringKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GiantShould {

    @Test
    public void haveAlwaysSpeedAs12() {
        final var panda = new GiantPanda();

        assertEquals(12.0, panda.getSpeed(), 0.0);
    }

}
