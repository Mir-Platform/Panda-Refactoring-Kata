package ru.starMir.pandaRefactoringKata;

class MirPlatFormRedPanda extends RedPanda {
    public MirPlatFormRedPanda(int numberOfBamboos) {
        super(numberOfBamboos, false);
    }

    @Override
    public double getSpeed() {
        return super.getSpeed() * 2;
    }
}
