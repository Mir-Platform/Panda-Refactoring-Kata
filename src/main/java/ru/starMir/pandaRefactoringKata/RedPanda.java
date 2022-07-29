package ru.starMir.pandaRefactoringKata;

public class RedPanda extends Panda {
    protected final boolean isSleeping;
    private final double numberOfBamboos;

    public RedPanda(double numberOfBamboos, boolean isSleeping) {
        super();
        this.numberOfBamboos = numberOfBamboos;
        this.isSleeping = isSleeping;
    }

    @Override
    public double getSpeed() {
        return (isSleeping) ? 0 : getBaseSpeed(numberOfBamboos);
    }

    protected double getBaseSpeed(double numberOfBamboos) {
        return Math.min(24.0, numberOfBamboos * getBaseSpeed());
    }
}
