package ru.starMir.pandaRefactoringKata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MirPlatformRedPandaShould {

    @Test
    void hasSpeedAsTwiceAsCommonRedAndNeverSleep() {
        final var panda = new MirPlatFormRedPanda(1);

        assertEquals(24, panda.getSpeed());
    }

}
