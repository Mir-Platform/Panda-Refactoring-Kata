package ru.starMir.pandaRefactoringKata;

public class GiantPanda extends Panda {
    public GiantPanda() {
        super();
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }
}
