package ru.starMir.pandaRefactoringKata;

public abstract class Panda {

    public Panda() {
    }

    public abstract double getSpeed();

    protected double getBaseSpeed() {
        return 12.0;
    }

}
