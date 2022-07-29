package ru.starMir.pandaRefactoringKata;

import org.junit.jupiter.api.Test;
import pandaRefactoringKata.Panda;
import pandaRefactoringKata.PandaTypeEnum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PandaShould {

    @Test
    public void haveSpeedAs12WhenItIsGiantOne() {
        Panda panda = new Panda(PandaTypeEnum.GIANT, 0, 0, false);
        assertEquals(12.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs10WhenItIsKungFuAndHas1Dan() {
        Panda panda = new Panda(PandaTypeEnum.KUNG_FU, 1, 0, false);
        assertEquals(10.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs8WhenItIsKungFuAndHas2Dan() {
        Panda panda = new Panda(PandaTypeEnum.KUNG_FU, 2, 0, false);
        assertEquals(8.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs6WhenItIsKungFuAndHas3Dan() {
        Panda panda = new Panda(PandaTypeEnum.KUNG_FU, 3, 0, false);
        assertEquals(6.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs0WhenItIsRedAndSleeping() {
        Panda panda = new Panda(PandaTypeEnum.RED, 0, 3, true);
        assertEquals(0.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs36WhenItIsRedAndNotSleepingAndHasEaten3Bamboos() {
        Panda panda = new Panda(PandaTypeEnum.RED, 0, 1, false);
        assertEquals(12.0, panda.getSpeed(), 0.0);
    }

    @Test
    public void haveSpeedAs24WhenItIsRedAndNotSleepingAndHasEaten4Bamboos() {
        Panda panda = new Panda(PandaTypeEnum.RED, 0, 4, false);
        assertEquals(24.0, panda.getSpeed(), 0.0);
    }
}
