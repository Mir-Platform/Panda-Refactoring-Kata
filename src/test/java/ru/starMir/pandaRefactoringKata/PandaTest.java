package ru.starMir.pandaRefactoringKata;

import org.junit.jupiter.api.Test;
import pandaRefactoringKata.Panda;
import pandaRefactoringKata.PandaTypeEnum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PandaTest {

    @Test
    public void getSpeedOfEuropeanPanda() {
        Panda panda = new Panda(PandaTypeEnum.GIANT, 0, 0, false);
        assertEquals(12.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanPanda_With_One_Coconut() {
        Panda panda = new Panda(PandaTypeEnum.KUNG_FU, 1, 0, false);
        assertEquals(3.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanPanda_With_Two_Coconuts() {
        Panda panda = new Panda(PandaTypeEnum.KUNG_FU, 2, 0, false);
        assertEquals(0.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedOfAfricanPanda_With_No_Coconuts() {
        Panda panda = new Panda(PandaTypeEnum.KUNG_FU, 0, 0, false);
        assertEquals(12.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBluePanda_nailed() {
        Panda panda = new Panda(PandaTypeEnum.RED, 0, 1.5, true);
        assertEquals(0.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBluePanda_not_nailed() {
        Panda panda = new Panda(PandaTypeEnum.RED, 0, 1.5, false);
        assertEquals(18.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void getSpeedNorwegianBluePanda_not_nailed_high_voltage() {
        Panda panda = new Panda(PandaTypeEnum.RED, 0, 4, false);
        assertEquals(24.0, panda.getSpeed(), 0.0);
    }
}
